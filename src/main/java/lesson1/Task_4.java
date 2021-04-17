package lesson1;

public class Task_4 {
    int roundLength(int cmLength) {
        return cmLength/100;
    }

    public static void main(String[] args) {
        Task_4 application = new Task_4();

        System.out.println(application.roundLength(115));
        System.out.println(application.roundLength(800));
        System.out.println(application.roundLength(278));
    }
}
