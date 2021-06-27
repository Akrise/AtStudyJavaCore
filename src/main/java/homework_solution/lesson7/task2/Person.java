package homework_solution.lesson7.task2;

import homework_solution.lesson6.task4.NameGenerator;

public class Person {
    private String surname;
    private String name;

    public Person() {
        NameGenerator nameGenerator = new NameGenerator();
        this.surname = nameGenerator.generate();
        this.name = nameGenerator.generate();
    }

    @Override
    public String toString() {
        return name + ' ' + surname;
    }
}
