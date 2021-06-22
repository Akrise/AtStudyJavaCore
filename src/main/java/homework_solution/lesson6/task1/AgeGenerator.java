package homework_solution.lesson6.task1;

import java.util.Random;

public class AgeGenerator {
    public int AgeGenerator() {
        return new Random().nextInt(55) + 20;
    }
}
