package services.json_placeholder;

import commons.Numbers;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import services.json_placeholder.model.PostModel;

import static com.google.common.truth.Truth.assertThat;


public class GetPostsTest {

    @DisplayName("should get random post")
    @Test
    void getRandomTest() {

        var response = JsonPlaceholderService.getPost(Numbers.getRandomInt(1, 99));

        PostModel parsedResponse = response.as(PostModel.class);

        assertThat(parsedResponse.body).isNotEmpty();
    }

    @DisplayName("should get all available posts")
    @Test
    void getAllPostsTest() {
        var response = JsonPlaceholderService.getPosts();
    }

    @DisplayName("should get all posts created by specific user")
    @Test
    void findPosts() {
        var userId = Numbers.getRandomInt(1, 10);
        var response = JsonPlaceholderService.getPosts(userId);
    }
}
