package lesson1;

public class Task_6 {
    public static void main(String[] args) {
        Task_6 application = new Task_6();
        System.out.println(application.shceme(false, false, false, false));
        System.out.println(application.shceme(true, true, true, true));
        System.out.println(application.shceme(false, true, false, true));
        System.out.println(application.shceme(true, false, true, false));
        System.out.println(application.shceme(true, true, false, false));
    }

    boolean shceme(boolean a, boolean b, boolean c, boolean d) {
        return (a && b) && !(c || d);
    }
}
