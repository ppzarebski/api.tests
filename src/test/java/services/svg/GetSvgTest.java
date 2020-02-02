package services.svg;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.google.common.truth.Truth.assertThat;

public class GetSvgTest {

    @DisplayName("should get and log svg source code")
    @Test
    void getSvgTest() {

        assertThat(SvgReaderService.logSvgSource("pin.svg")).isNotNull();
        assertThat(SvgReaderService.logSvgSource("doors.svg")).isNotNull();
        assertThat(SvgReaderService.logSvgSource("text01.svg")).isNotNull();
        assertThat(SvgReaderService.logSvgSource("text02.svg")).isNotNull();
    }

    @DisplayName("should get and parse svg to text")
    @Test
    void readSvgTest() {

        assertThat(SvgReaderService.readSvg("pin.svg")).contains("3492");
        assertThat(SvgReaderService.readSvg("doors.svg")).contains("Doors");
        assertThat(SvgReaderService.readSvg("text01.svg")).contains("there");
        assertThat(SvgReaderService.readSvg("text02.svg")).contains("labore et dolore");
    }
}
