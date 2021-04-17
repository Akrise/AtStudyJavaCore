package lesson1;

public class Task_1 {
    double Area(int radius) {
        final double PI = 3.14;
        return PI * radius * radius;
    }

    public static void main(String[] args) {
        Task_1 application = new Task_1();
        int radius1 = 0;
        int radius2 = 2;
        int radius3 = 100;
        System.out.println(application.Area(radius1));
        System.out.println(application.Area(radius2));
        System.out.println(application.Area(radius3));
    }
}
