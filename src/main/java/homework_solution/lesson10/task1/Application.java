package homework_solution.lesson10.task1;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class Application {
    public static void main(String[] args) throws IOException {
        File inputFile = new File("src\\main\\java\\homework_solution\\lesson10\\task1\\input.txt");
        File outputFile = new File("src\\main\\java\\homework_solution\\lesson10\\task1\\output.txt");
        FileHelper fileHelper = new FileHelper();
        Map<String, String> input = fileHelper.readFile(inputFile);

        fileHelper.saveFile(outputFile, input);
    }
}
