package services.svg;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.google.common.truth.Truth.assertThat;

public class GetSvgTest {

    @DisplayName("should get and log svg")
    @Test
    public void getSvgTest() {

        var svg = SvgReaderService.getSvg("pin.svg");

        assertThat(svg).isNotNull();
    }

    @DisplayName("should get and parse svg to text")
    @Test
    public void readSvgTest() {

        var text = SvgReaderService.readSvg("pin.svg");
        SvgReaderService.readSvg("doors.svg");
        SvgReaderService.readSvg("text01.svg");
        SvgReaderService.readSvg("text02.svg");
        SvgReaderService.readSvg("three.svg");

        assertThat(text).isNotNull();
    }
}
