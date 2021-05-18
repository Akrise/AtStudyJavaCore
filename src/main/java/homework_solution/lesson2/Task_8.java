package homework_solution.lesson2;

public class Task_8 {
    public static void main(String[] args) {
        int[] testCases = {-1, 2, 4, 7, 0, 1, 3};
        System.out.println("Switch with break:");
        for (int inputNumber : testCases) {
            switch (inputNumber) {
                case 1:
                    System.out.println("A");
                    break;
                case 2:
                    System.out.println("AA");
                    break;
                case 3:
                    System.out.println("AAA");
                    break;
                case 4:
                    System.out.println("AAAA");
                    break;
                default:
                    System.out.println("AAAAA");
            }
        }

        System.out.printf("%nSwitch without break:%n");
        for (int inputNumber : testCases) {
            switch (inputNumber) {
                default:
                    System.out.print('A');
                case 4:
                    System.out.print('A');
                case 3:
                    System.out.print('A');
                case 2:
                    System.out.print('A');
                case 1:
                    System.out.println('A');

            }
        }

    }
}

