package homework_solution.lesson5.task4;

import java.io.IOException;

public class AgeTooHighException extends IOException {
    public AgeTooHighException() {
        System.out.println("Исключение AgeTooHighException - Возраст животного должен быть меньше 20");
    }
}
