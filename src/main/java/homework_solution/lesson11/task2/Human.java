package homework_solution.lesson11.task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Human {
    private String firstName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (!validateName(firstName)) {
            throw new IllegalArgumentException("Некорректное имя: " + firstName);
        }
        this.firstName = firstName;
    }

    private boolean validateName(String firstName) {
        Pattern pattern = Pattern.compile("[А-Я][а-я]{2,11}");
        Matcher matcher = pattern.matcher(firstName);
        return matcher.matches();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Некорректный возраст: " + age);
        }
        this.age = age;
    }
}
