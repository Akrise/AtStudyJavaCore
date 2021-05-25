package homework_solution.lesson3.task5;

import java.util.Random;

public class Human {
    Cat[] cats;
    Dog[] dogs;
    private String name;
    private int age;

    public Human() {
        Random random = new Random();
        name = Names.getHumanName();
        age = random.nextInt(100);
        cats = new Cat[random.nextInt(4)];
        for (int i = 0; i < cats.length; i++) {
            cats[i] = new Cat();
        }
        dogs = new Dog[random.nextInt(4)];
        for (int i = 0; i < dogs.length; i++) {
            dogs[i] = new Dog();
        }
    }

    public void showHuman() {
        System.out.println("My name is " + name + " i'am " + age + "years old");
        System.out.print("Cats: ");
        for (Cat cat : cats
        ) {
            System.out.print(cat.name + " ");
        }
        System.out.println();
        System.out.print("Dogs: ");
        for (Dog dog : dogs) {
            System.out.print(dog.name + " ");
        }
        System.out.println();
    }
}
