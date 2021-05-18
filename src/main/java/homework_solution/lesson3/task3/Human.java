package homework_solution.lesson3.task3;

public class Human {
    String name;
    int age;
    Human father;
    Human mother;

    public Human(String name, int age, Human father, Human mother) {
        this.name = name;
        this.age = age;
        this.father = father;
        this.mother = mother;
    }

    public void speak() {
        String introduction = "Hi, my name is " + name + ", i am " + age + " years old. ";
        if (father != null) introduction += "My father is " + father.name + ". ";
        if (mother != null) introduction += "My mother is " + mother.name + ". ";
        System.out.println(introduction);
    }

    public Human getFather() {
        return father;
    }

    public Human getMother() {
        return mother;
    }
}
