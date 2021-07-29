package homework_solution.lesson10.task2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileHelper {
    public static void write(List<String> content) {
        try {
            FileWriter fileWriter = new FileWriter(Config.OUTPUT_FILE);
            fileWriter.write(String.join("\n", content));
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
