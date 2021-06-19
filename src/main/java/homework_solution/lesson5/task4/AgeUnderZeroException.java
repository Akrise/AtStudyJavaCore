package homework_solution.lesson5.task4;

public class AgeUnderZeroException extends RuntimeException {
    public AgeUnderZeroException() {
        System.out.println("Исключение AgeUnderZeroException - Возраст не может быть отрицательным");
    }
}
