package homework_solution.lesson6.task2;

import java.util.Random;

public class Chance {
    public boolean calculateChance(int percent) {
        return percent >= new Random().nextInt(100);
    }
}
