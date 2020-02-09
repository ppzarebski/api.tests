package services.petstore;

import commons.Numbers;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import services.petstore.sampler.PetstoreSampler;

import static com.google.common.truth.Truth.assertThat;


public class FindPetTest {

    @DisplayName("should find random pet")
    @Test
    void getRandomPetTest() {
        var pet = PetstoreService.getPet(Numbers.getRandomInt(1, 99));
        assertThat(pet.body()).isNotNull();
    }

    @DisplayName("should find random pet")
    @Test
    void editRandomPetTest() {
        var petId = Numbers.getRandomInt(1, 99);
        var petInput = PetstoreSampler.fullPetInput(petId);
        PetstoreService.updatePet(petInput);
        var pet = PetstoreService.getPet(petId);
        assertThat(pet.body()).isNotNull();
    }
}
