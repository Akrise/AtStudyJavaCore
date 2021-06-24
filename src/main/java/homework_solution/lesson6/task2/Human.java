package homework_solution.lesson6.task2;

import java.util.HashMap;
import java.util.Map;

public class Human {
    Map<PhoneType, String> phones = new HashMap<>();
    private String surname;
    private String name;
    private int age;

    public Human(String surname, String name, int age) {
        this.surname = surname;
        this.name = name;
        this.age = age;
    }

    public void addPhone(PhoneType phoneType, String phone) {
        this.phones.put(phoneType, phone);
    }

    public void print() {
        System.out.printf("\n%s %s, %d лет\n", surname, name, age);
        for (Map.Entry<PhoneType, String> phone : phones.entrySet()) {
            System.out.printf("%s %s\n", phone.getKey().getDescription(), phone.getValue());
        }
    }
}
