package homework_solution.lesson6.task1;

public class Human {
    private String name;
    private String surname;
    private int age;
    private String phone;

    public Human(String name, String surname, int age, String phone) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return surname + ' ' + name + ", возраст " + age + ", тел. " + phone;
    }
}
