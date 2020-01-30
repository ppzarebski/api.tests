package services.json_placeholder;

import commons.Numbers;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import services.json_placeholder.model.PostModel;

import static java.util.function.Predicate.not;
import static org.hamcrest.MatcherAssert.assertThat;


public class GetPostTest {

    @DisplayName("should get random post")
    @Test
    public void getRandomTest() {

        var response = JsonPlaceholderService.getPosts(Numbers.getRandomInt(1, 99));

        PostModel parsedResponse = response.as(PostModel.class);

        assertThat(parsedResponse.body, !(parsedResponse.body.isEmpty()));

    }
}
