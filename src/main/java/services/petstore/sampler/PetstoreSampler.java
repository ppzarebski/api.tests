package services.petstore.sampler;

import commons.Word;
import services.petstore.model.PetModel;

import java.util.ArrayList;

public class PetstoreSampler {

    public static PetModel fullPetInput(Integer id) {
        var input = new PetModel();
        input.id = id;
        input.category = new PetModel.Entity();
        input.category.id = 1;
        input.category.name = "DDD";
        input.name = Word.name();
        input.photoUrls = new ArrayList<>();
        input.photoUrls.add("urlToNicePhoto");
        input.tags = new ArrayList<>();
        input.tags.add(new PetModel.Entity(0, "Azor"));
        input.status = "awailable";
        return input;
    }
}
