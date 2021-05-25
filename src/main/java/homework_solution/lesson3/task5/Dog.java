package homework_solution.lesson3.task5;

import java.util.Random;

public class Dog {
    String name;
    int age;

    public Dog() {
        Random random = new Random();
        this.name = Names.getDogName();
        age = random.nextInt(10);
    }
}
