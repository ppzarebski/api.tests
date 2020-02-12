package services.petstore;

import commons.Numbers;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import services.petstore.model.PetStatus;

import static com.google.common.truth.Truth.assertThat;


public class FindPetTest {

    @DisplayName("should find random pet")
    @Test
    void getRandomPetTest() {
        var pet = PetstoreService.getPet(Numbers.getRandomInt(1, 99));
        assertThat(pet.body()).isNotNull();
    }

    @DisplayName("should find pets by its status")
    @ParameterizedTest(name = "should find pet of status {0}")
    @EnumSource(value = PetStatus.class)
    void getPetsByStatus(PetStatus status) {

        var pets = PetstoreService.getPets(status.toString().toLowerCase());
        assertThat(pets.body()).isNotNull();
    }
}
