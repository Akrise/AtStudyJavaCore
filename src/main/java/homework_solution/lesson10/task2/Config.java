package homework_solution.lesson10.task2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Config {
    public static final String OUTPUT_FILE;
    public static final Integer LINES_AMOUNT;
    public static final Integer MAX_LENGTH;
    public static final Integer MIN_LENGTH;
    public static final String LINES_PATTERN;
    public static final String LINES_MESSAGE;
    private static Properties properties = new Properties();

    static {
        try {
            properties.load(new FileInputStream("src\\main\\java\\homework_solution\\lesson10\\task2\\application.properties"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        OUTPUT_FILE = getProperty("output.file", "Property not found");
        LINES_AMOUNT = getIntegerProperty("lines.amount", 0);
        MAX_LENGTH = getIntegerProperty("lines.max.length", 0);
        MIN_LENGTH = getIntegerProperty("lines.min.length", 0);
        LINES_PATTERN = getProperty("lines.pattern", "Property not found");
        LINES_MESSAGE = getProperty("lines.message", "Property not found");
    }

    private static Boolean getBooleanProperty(String key, Boolean defaultValue) {
        return Boolean.parseBoolean(properties.getProperty(key, String.valueOf(defaultValue)));
    }

    private static Integer getIntegerProperty(String key, Integer defaultValue) {
        return Integer.parseInt(properties.getProperty(key, String.valueOf(defaultValue)));
    }

    private static String getProperty(String key, String defaultValue) {
        return properties.getProperty(key, defaultValue);

    }
}
