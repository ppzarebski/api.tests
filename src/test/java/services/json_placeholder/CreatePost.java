package services.json_placeholder;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import services.json_placeholder.model.PostModel;
import services.json_placeholder.sampler.PostSampler;

import static com.google.common.truth.Truth.assertThat;


public class CreatePost {

    @DisplayName("should edit post")
    @Test
    void createPost() {
        var postInput = PostSampler.fullInput();
        var createdPost = JsonPlaceholderService.createPost(postInput).as(PostModel.class);
        assertThat(createdPost.body).isEqualTo(postInput.body);
        assertThat(createdPost.title).isEqualTo(postInput.title);
    }
}
