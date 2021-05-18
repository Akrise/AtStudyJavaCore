package homework_solution.lesson2;

public class Task_7 {
    public static void main(String[] args) {
        int[] testCases = {32, 52, 66, 82, 25, 44, 60, 75, 22, 119};
        for (int age : testCases) {
            System.out.println(showAgeGroup(age));
        }
    }

    private static String showAgeGroup(int age) {
        if (age >= 25 && age < 44)
            return "Молодой возраст";
        if (age >= 44 && age < 60)
            return "Средний возраст";
        if (age >= 60 && age < 75)
            return "Пожилой возраст";
        if (age >= 75 && age < 90)
            return "Старческий возраст";
        return "Неизвестный возраст";
    }
}
