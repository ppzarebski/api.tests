package services.svg;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import commons.ReadSVG;
import commons.RequestSpecification;

public class SvgReaderService {

    public static final String BASE_URL = "https://ppzarebski.github.io/svg/";

    public static Response getSvg(String fileName) {
        RequestSpecification.get(BASE_URL + fileName);
        return RestAssured.given().get().thenReturn();
    }

    public static String readSvg(String fileName) {
        return ReadSVG.readPng(ReadSVG.convertSvgToPng(ReadSVG.getSvg(BASE_URL + fileName)));
    }
}
