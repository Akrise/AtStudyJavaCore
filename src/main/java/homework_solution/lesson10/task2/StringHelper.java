package homework_solution.lesson10.task2;

import java.util.Random;

public class StringHelper {
    public static String generate() {
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < Config.MAX_LENGTH; i++) {
            stringBuilder.append(Config.LINES_PATTERN.charAt(random.nextInt(Config.LINES_PATTERN.length())));
            //с 10% шансом перестаем добавлять символы в строку после достижения минимальной длинны.
            if (i > Config.MIN_LENGTH && random.nextInt(10) == 0) {
                break;
            }
        }
        return String.format(Config.LINES_MESSAGE, stringBuilder.toString());
    }
}
