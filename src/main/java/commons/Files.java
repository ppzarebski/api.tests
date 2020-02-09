package commons;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Files {

    public static List<String> arrayOfLines(String fileWithExtension) {
        List<String> arrayOfLines = new ArrayList<>();
        String basePath = new File("src\\main\\resources").getAbsolutePath();
        try (BufferedReader read = new BufferedReader(new FileReader(basePath + "\\" + fileWithExtension))) {
            String nextLine;
            while ((nextLine = read.readLine()) != null) {
                arrayOfLines.add(nextLine);
            }
        } catch (Exception e) {
            System.out.println("File does not exist. Exception catched.");
        }
        return arrayOfLines;
    }
}
