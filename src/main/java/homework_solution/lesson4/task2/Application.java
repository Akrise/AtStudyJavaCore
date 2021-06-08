package homework_solution.lesson4.task2;

import homework_solution.lesson4.task1.Human;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Validator validator = new Validator();
        Human[] humans = new Human[3];
        int humanCount = 0;
        Scanner scanner = new Scanner(System.in);
        String inputLine;
        String[] splitedLine;
        Human human = new Human();
        System.out.println("Вводите данные сотрудников в формате \"Фамилия Имя ДатаРождения(eg 10.10.1990)\" до полного заполнения списка:");
        while (validator.validateHumansArray(humans)) {
            inputLine = scanner.nextLine();
            if (validator.validateString(inputLine)) {
                splitedLine = validator.splitString(inputLine);
                human.setLastName(splitedLine[0]);
                human.setFirstName(splitedLine[1]);
                try {
                    human.setBirthDate(new SimpleDateFormat("dd.MM.yyyy").parse(splitedLine[2]));
                } catch (ParseException e) {
                    System.out.println("Parse exception. Повторите последний ввод, соблюдая формат даты рождения dd.MM.yyyy");
                    continue;
                }
                humans[humanCount] = human;
                humanCount++;
            }
        }

    }
}
