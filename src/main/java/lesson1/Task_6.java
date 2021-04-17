package lesson1;

public class Task_6 {
    boolean Shceme(boolean a, boolean b , boolean c, boolean d){
        return (a&&b)&&!(c||d);
    }

    public static void main(String[] args) {
        Task_6 application = new Task_6();
        System.out.println(application.Shceme(false, false, false, false));
        System.out.println(application.Shceme(true, true, true, true));
        System.out.println(application.Shceme(false, true, false, true));
        System.out.println(application.Shceme(true, false, true, false));
        System.out.println(application.Shceme(true, true, false, false));
    }
}
