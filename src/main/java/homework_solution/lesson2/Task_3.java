package homework_solution.lesson2;

public class Task_3 {
    public static void main(String[] args) {
        String[] testCases = {
                "+7(910)423-73-12",
                "7(910)423-73-12",
                "89215310934",
                "+5(911)310-12-74",
                "+7(9fg)125-42-99",
                "+7(122)2342343",
                "+7(910)423-73-123"
        };
        System.out.println("For cycle verification results:");
        for (String inputString : testCases) {
            System.out.println(Task_3.isPhoneNumberFor(inputString));
        }
        System.out.println("RegExp verification results:");
        for (String inputString : testCases) {
            System.out.println(Task_3.isPhoneNumberRegExp(inputString));
        }

    }

    private static boolean isPhoneNumberRegExp(String inputString) {
        return inputString.matches("^(\\+7\\()\\d{3}\\)\\d{3}-\\d{2}-\\d{2}");
    }

    private static boolean isPhoneNumberFor(String inputString) {
        if (inputString.length() != 16) return false;
        if (!inputString.startsWith("+7(") || inputString.charAt(6) != ')' || inputString.charAt(10) != '-' || inputString.charAt(13) != '-')
            return false;
        for (int i = 1; i < 16; i++) {
            if (i == 2 || i == 6 || i == 10 || i == 13) continue;
            if (!Character.isDigit(inputString.charAt(i))) return false;
        }
        return true;
    }
}
