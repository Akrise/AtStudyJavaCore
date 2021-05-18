package homework_solution.lesson1;

public class Task_1 {
    double calculateArea(int radius) {
        final double PI = 3.14;
        return PI * radius * radius;
    }

    public static void main(String[] args) {
        Task_1 application = new Task_1();

        System.out.println(application.calculateArea(0));
        System.out.println(application.calculateArea(2));
        System.out.println(application.calculateArea(100));
    }
}
