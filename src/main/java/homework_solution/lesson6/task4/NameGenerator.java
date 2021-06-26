package homework_solution.lesson6.task4;

import java.util.Random;

public class NameGenerator {
    public String generate() {
        Random random = new Random();
        StringBuilder name = new StringBuilder();

        name.append((char) (random.nextInt(32) + 'А'));
        for (int i = 0; i < 4 + random.nextInt(9); i++) {
            name.append((char) (random.nextInt(32) + 'а'));
        }
        return name.substring(0);
    }
}
