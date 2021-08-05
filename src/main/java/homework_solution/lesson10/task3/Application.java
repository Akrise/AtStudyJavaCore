package homework_solution.lesson10.task3;

import java.io.File;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        FileGen fileGen = new FileGen();
        List<File> files = fileGen.generate();
        for (File file : files) {
            System.out.println(file.getName() + ": " + file.length());
        }
    }
}
