package homework_solution.lesson4.task1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Application {
    public static void main(String[] args) throws ParseException {
        Human human = new Human();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        human.setLastName("Теркин");
        human.setFirstName("Василий");
        human.setBirthDate(dateFormat.parse("1990-04-12"));
        human.setLastName("плохаяфамилия");
        human.setFirstName("АнтоН");
        human.setBirthDate(dateFormat.parse("1990-05-15"));
        human.setLastName("Tzeentch");
        human.setFirstName("Ва");
        human.setBirthDate(dateFormat.parse("2025-04-15"));
    }
}
