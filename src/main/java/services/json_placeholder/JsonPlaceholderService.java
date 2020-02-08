package services.json_placeholder;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import commons.RequestSpecification;
import services.json_placeholder.model.PostModel;

public class JsonPlaceholderService {

    public static final String BASE_URL = "https://jsonplaceholder.typicode.com";

    public static final String POSTS = "/posts";
    public static final String POST = "/posts/{postId}";

    public static Response createPost(PostModel input) {
        RequestSpecification.get(BASE_URL);
        return RestAssured.given().body(input).post(POSTS).thenReturn();
    }

    public static Response getPost(Integer postId) {
        RequestSpecification.get(BASE_URL);
        return RestAssured.given().pathParam("postId", postId).get(POST).thenReturn();
    }

    public static Response getPosts() {
        RequestSpecification.get(BASE_URL);
        return RestAssured.given().get(POSTS).thenReturn();
    }

    public static Response getPosts(Integer userId) {
        RequestSpecification.get(BASE_URL);
        return RestAssured.given().queryParam("userId", userId).get(POSTS).thenReturn();
    }
}
