package homework_solution.lesson10.task3;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class FileGen {
    private List<Integer> sizes;
    private List<String> extensions;
    private int amount;
    private Properties properties = new Properties();
    private Random random = new Random();

    public FileGen() {
        initValues();
    }

    public FileGen(List<String> extensions, int amount) {
        this.extensions = extensions;
        this.amount = amount;
        initValues();
    }

    public FileGen(List<Integer> sizes, List<String> extensions) {
        this.sizes = sizes;
        this.extensions = extensions;
        initValues();
    }

    public FileGen(List<Integer> sizes) {
        this.sizes = sizes;
        initValues();
    }

    public FileGen(List<Integer> sizes, List<String> extensions, int amount) {
        this.sizes = sizes;
        this.extensions = extensions;
        this.amount = amount;
    }

    private void initValues() {
        try {
            properties.load(new FileInputStream("src//main//java//homework_solution//lesson10//task3//application.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (amount == 0) {
            amount = Integer.parseInt(properties.getProperty("filegen.amount", "10"));
        }
        if (sizes == null) {
            sizes = new ArrayList<>();
            int minsize = Integer.parseInt(properties.getProperty("filegen.minsize", "1000"));
            int maxsize = Integer.parseInt(properties.getProperty("filegen.maxsize", "10000"));
            for (int i = 0; i < amount; i++) {
                sizes.add(minsize + random.nextInt(maxsize - minsize));
            }
        }
        if (extensions == null) {
            extensions = Arrays.asList((properties.getProperty("filegen.extensions", "TXT")).split(","));
        }
    }

    public List<File> generate() {
        List<File> files = new ArrayList<>(amount);
        for (int i = 0; i < amount; i++) {
            String outputPath = properties.getProperty("filegen.outputfolder", "src\\main\\java\\homework_solution\\lesson10\\task3\\output\\");
            System.out.println(outputPath);
            File file = new File(outputPath + "generatedFile" + (100_000 + random.nextInt(899_999)) + '.' + extensions.get(random.nextInt(extensions.size())));
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
            byte[] bytes = new byte[sizes.get(i)];
            try {
                Files.write(Paths.get(file.getPath()), bytes);
            } catch (IOException e) {
                e.printStackTrace();
            }
            files.add(file);
        }
        return files;
    }
}