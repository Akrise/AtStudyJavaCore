package homework_solution.lesson4.task1;

import java.util.Random;

public class ArrayActions {
    /**
     * Заполняет массив случайными числами
     *
     * @param inputArray Входящий массив
     * @param from       нижняя граница случайного числа
     * @param to         верхняя граница случайного числа
     * @return заполненный массив
     */
    public static int[] fillArrayRandom(int[] inputArray, int from, int to) {
        Random random = new Random();
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = random.nextInt(to - from + 1) + from;
        }
        return inputArray;
    }

    public static void showArray(int[] inputArray) {
        for (int element : inputArray
        ) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    /**
     * Создает двумерный массив, где каждая i-ая строка является результатом деления элемента dividends[i] на каждый элемент массива dividers. В случае деления на ноль значение результата равно -1.
     *
     * @param dididends массив делимых
     * @param dividers  массив делителей
     * @return двумерный массив
     */
    public static int[][] createMatrix(int[] dididends, int[] dividers) {
        int[][] outputMatrix = new int[dididends.length][dividers.length];
        for (int i = 0; i < dididends.length; i++) {
            for (int j = 0; j < dividers.length; j++) {
                try {
                    outputMatrix[i][j] = dididends[i] / dividers[j];
                } catch (ArithmeticException e) {
                    outputMatrix[i][j] = -1;
                }
                System.out.print(outputMatrix[i][j] + " ");
            }
            System.out.println();
        }
        return outputMatrix;
    }
}
