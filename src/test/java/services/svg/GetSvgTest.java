package services.svg;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GetSvgTest {

    @DisplayName("should get and parse svg")
    @Test
    public void getSvgTest() {

        var response = SvgService.getSvg();
    }
}
