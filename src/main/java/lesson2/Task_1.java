package lesson2;

public class Task_1 {
    public static void main(String[] args) {
        String[] fridayIs = {"Пятница", "это", "лучший", "день", "недели"};
        Task_1.showWithFor(fridayIs);
        Task_1.showWithForeach(fridayIs);
        Task_1.showWithWhile(fridayIs);
    }

    private static void showWithWhile(String[] inputStringArray) {
        int i = 0;
        while (i < inputStringArray.length - 1) {
            System.out.print(inputStringArray[i++] + ' ');
        }
        System.out.println(inputStringArray[inputStringArray.length - 1] + '.');
    }

    private static void showWithForeach(String[] inputStringArray) {
        String buffer = "";
        for (String word : inputStringArray) {
            buffer += word + " ";
        }
        buffer = buffer.trim() + '.';
        System.out.println(buffer);
    }

    private static void showWithFor(String[] inputStringArray) {
        for (int i = 0; i < inputStringArray.length - 1; i++) {
            System.out.print(inputStringArray[i] + ' ');
        }
        System.out.println(inputStringArray[inputStringArray.length - 1] + '.');
    }
}
