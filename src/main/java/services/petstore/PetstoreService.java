package services.petstore;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import commons.RequestSpecification;

public class PetstoreService {

    private static final String BASE_URL = "https://petstore.swagger.io/v2";

    private static final String STORE_INV = "/store/inventory";

    public static Response getStoreInventory() {
        RequestSpecification.get(BASE_URL);
        return RestAssured.given().get(STORE_INV).thenReturn();
    }
}
