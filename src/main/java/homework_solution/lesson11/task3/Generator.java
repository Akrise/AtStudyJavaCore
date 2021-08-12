package homework_solution.lesson11.task3;

import java.util.Random;

public class Generator {
    public static int randomInteger(int start, int end) {
        return new Random().nextInt(end - start) + start + 1;
    }

    public static String randomString(int startLength, int endLength) {
        final String pattern = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder stringBuilder = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i <= startLength + random.nextInt(endLength - startLength); i++) {
            stringBuilder.append(pattern.charAt(random.nextInt(pattern.length())));
        }
        return stringBuilder.toString();
    }
}
