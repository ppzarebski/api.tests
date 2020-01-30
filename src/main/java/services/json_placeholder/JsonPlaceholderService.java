package services.json_placeholder;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import commons.RequestSpecification;

public class JsonPlaceholderService {

    public static final String BASE_URL = "https://jsonplaceholder.typicode.com";

    public static final String POSTS = "/posts";
    public static final String POST = "/posts/{postId}";

    public static Response getPosts(Integer postId) {
        RequestSpecification.get(BASE_URL);
        return RestAssured.given().pathParam("postId", postId).get(POST).thenReturn();
    }
}
