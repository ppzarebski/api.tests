package services.svg;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import commons.RequestSpecification;

public class SvgService {

    public static final String BASE_URL = "https://ppzarebski.github.io/svg/three.svg";

    public static Response getSvg() {
        RequestSpecification.get(BASE_URL);
        return RestAssured.given().get().thenReturn();
    }
}
