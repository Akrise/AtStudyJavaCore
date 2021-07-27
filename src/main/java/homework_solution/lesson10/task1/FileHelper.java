package homework_solution.lesson10.task1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileHelper {
    public Map<String, String> readFile(File file) throws IOException {
        List<String> allLines = Files.readAllLines(Paths.get(file.getAbsolutePath()));
        Map<String, String> content = new HashMap<>();
        for (String string : allLines) {
            Pattern pattern = Pattern.compile("(.*)=(.*)");
            Matcher matcher = pattern.matcher(string);
            matcher.find();
            content.put(matcher.group(1), matcher.group(2));
        }
        return content;
    }


    public void saveFile(File file, Map<String, String> input) {
        StringBuilder buffer = new StringBuilder();
        buffer.append("{\n");
        for (Map.Entry<String, String> entry : input.entrySet()) {
            buffer.append("  \"").append(entry.getKey()).append("\": ");
            if (entry.getValue().length() == 0) {
                buffer.append("[],\n");
                continue;
            }
            if (entry.getValue().matches("\\d*") || entry.getValue().matches("\\d+[.]\\d+") || entry.getValue().equals("null") || entry.getValue().equals("true") || entry.getValue().equals("false")) {
                buffer.append(entry.getValue());
            } else if (entry.getValue().matches(".*[а-яА-Я].*")) {
                buffer.append("\"").append(entry.getValue()).append("\"");
            }
            buffer.append(",\n");
        }
        buffer.replace(buffer.lastIndexOf(","), buffer.lastIndexOf(",") + 1, "");
        buffer.append("}");
        try (FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write(buffer.toString());
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
