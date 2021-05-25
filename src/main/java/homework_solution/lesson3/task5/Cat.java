package homework_solution.lesson3.task5;

import java.util.Random;

public class Cat {
    String name;
    int age;

    public Cat() {
        Random random = new Random();
        this.name = Names.getCatName();
        age = random.nextInt(10);
    }
}
