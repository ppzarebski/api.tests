package services.json_placeholder.sampler;

import commons.Numbers;
import commons.Strings;
import services.json_placeholder.model.PostModel;

public class PostSampler {

    public static PostModel fullInput() {
        var input = new PostModel();
        input.body = Strings.shortMessage();
        input.userId = Numbers.getRandomInt(11, 25);
        input.title = Strings.fullName();
        return input;
    }
}
