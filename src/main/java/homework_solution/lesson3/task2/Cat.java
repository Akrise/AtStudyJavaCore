package homework_solution.lesson3.task2;

public class Cat implements Comparable<Cat> {
    int age;
    int weight;
    String name;

    public Cat(int age, int weight, String name) {
        this.age = age;
        this.weight = weight;
        this.name = name;
    }

    void printData() {
        System.out.printf("Имя: %s, Возраст: %d, Вес: %d%n", name, age, weight);
    }

    public int compareTo(Cat otherCat) {
        return this.name.compareTo(otherCat.name);
    }
}
