package lesson2;

public class Task_7 {
    public static void main(String[] args) {
        int[] testCases = {32, 52, 66, 82, 25, 44, 60, 75, 22, 119};
        for (int age : testCases) {
            showAgeGroup(age);
        }
    }

    private static void showAgeGroup(int age) {
        if (age >= 25 && age < 44) {
            System.out.println("Молодой возраст");
            return;
        }
        if (age >= 44 && age < 60) {
            System.out.println("Средний возраст");
            return;
        }
        if (age >= 60 && age < 75) {
            System.out.println("Пожилой возраст");
            return;
        }
        if (age >= 75 && age < 90) {
            System.out.println("Старческий возраст");
            return;
        }
        System.out.println("Неизвестный возраст");
    }
}
