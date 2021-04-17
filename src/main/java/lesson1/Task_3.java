package lesson1;

public class Task_3 {
    boolean isOdd(int number) {
        return number % 2 == 1;
    }

    public static void main(String[] args) {
        Task_3 application = new Task_3();

        System.out.println(application.isOdd(14));
        System.out.println(application.isOdd(19));
    }
}
