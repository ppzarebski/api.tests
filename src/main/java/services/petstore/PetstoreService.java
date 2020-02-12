package services.petstore;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import commons.RequestSpecification;
import services.petstore.model.PetModel;

public class PetstoreService {

    private static final String BASE_URL = "https://petstore.swagger.io/v2";

    private static final String STORE_INV = "/store/inventory";
    private static final String PET = "/pet/{petId}";
    private static final String PETS = "/pet/findByStatus";

    public static Response getStoreInventory() {
        RequestSpecification.get(BASE_URL);
        return RestAssured.given().get(STORE_INV).thenReturn();
    }

    public static Response getPet(Integer petId) {
        RequestSpecification.get(BASE_URL);
        return RestAssured.given().pathParam("petId", petId).get(PET).thenReturn();
    }

    public static Response getPets(String status) {
        RequestSpecification.get(BASE_URL);
        return RestAssured.given().queryParam("status", status).get(PETS).thenReturn();
    }

    public static Response updatePet(PetModel input) {
        RequestSpecification.get(BASE_URL);
        return RestAssured.given()
                .body(input)
                .put()
                .thenReturn();
    }
}
