package homework_solution.lesson5.task3;

import java.util.Random;

public class Application {
    public static void main(String[] args) {
        Random rnd = new Random();
        int m;
        int n;
        int divResult;
        int errorCount = 0;
        int total = rnd.nextInt(500) + 500;
        for (int i = 0; i < total; i++) {
            try {
                m = rnd.nextInt(4);
                n = rnd.nextInt(4);
                divResult = m / n;
            } catch (ArithmeticException e) {
                errorCount++;
            }
        }
        System.out.printf("Из %d операций деления %d было выполнено с ошибкой", total, errorCount);
    }
}
