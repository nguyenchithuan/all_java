package fpt.java_72;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

public class Files_readAllLines {
    public static void main(String[] args) {
        File file = new File("F:\\Hoc_Java\\Java2\\TITV\\Java_72\\thuan.txt");
        try {
            List<String> allText = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
            for (String line : allText) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
