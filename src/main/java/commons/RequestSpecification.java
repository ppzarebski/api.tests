package commons;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.builder.RequestSpecBuilder;
import com.jayway.restassured.filter.log.ResponseLoggingFilter;
import com.jayway.restassured.http.ContentType;

public class RequestSpecification {

    public static com.jayway.restassured.specification.RequestSpecification get(String url) {
         return RestAssured.requestSpecification = new RequestSpecBuilder()
                .setBaseUri(url)
                .addFilter(new ResponseLoggingFilter())
                .setContentType(ContentType.JSON)
                .build()
                .log().all();
    }
}

