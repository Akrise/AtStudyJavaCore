package homework_solution.lesson6.task4;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();

        for (int i = 0; i < 500; i++) {
            Person person = new Person();
            personList.add(person.random());
        }
        IdentityDocumentType.printStatistic();
        for (int i = 0; i < personList.size(); i++) {
            if (!personList.get(i).getIDCode().equals("21")) {
                personList.remove(i);
                i--;
            }
        }
        System.out.println("Количество записей с кодом ДУЛ 21: " + personList.size());
    }
}
