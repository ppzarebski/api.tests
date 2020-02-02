package commons;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
import net.sourceforge.tess4j.util.LoadLibs;
import org.apache.batik.transcoder.TranscoderInput;
import org.apache.batik.transcoder.TranscoderOutput;
import org.apache.batik.transcoder.image.PNGTranscoder;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.net.URL;
import java.nio.file.Paths;

public class ReadSVG {
    public static File getSvg(String url) {
        File file = null;
        try {
            URL pathUrl = new URL(url);
            String path = getTempPath() + ".svg";
            file = new File(path);
            FileUtils.copyURLToFile(pathUrl, file);
        } catch (Exception e) {
            System.out.println("SVG file not found.");
        }
        return file;
    }

    public static File convertSvgToPng(File file) {
        String path = getTempPath() + ".png";
        try {
            TranscoderInput input_svg_image = new TranscoderInput(Paths.get(file.getPath()).toUri().toURL().toString());
            OutputStream png_ostream = new FileOutputStream(path);
            TranscoderOutput output_png_image = new TranscoderOutput(png_ostream);
            PNGTranscoder my_converter = new PNGTranscoder();
            my_converter.transcode(input_svg_image, output_png_image);

            png_ostream.flush();
            png_ostream.close();
        } catch (Exception e) {
            System.out.println("Cannot find SVG file to convert.");
        }
        return new File(path);
    }

    public static String readPng(File file) {
        String result = null;

        Tesseract instance = new Tesseract();
        File tessDataFolder = LoadLibs.extractTessResources("tessdata");
        instance.setDatapath(tessDataFolder.getAbsolutePath());
        File imageFile = new File(file.getAbsolutePath());

        try {
            result = instance.doOCR(imageFile);
            System.out.println(result);
        } catch (TesseractException e) {
            System.out.println("Reading failed or file not found.");
        }
        return result;
    }

    private static String getTempPath() {
        return System.getProperty("java.io.tmpdir")
                .concat("tmp");
    }
}
