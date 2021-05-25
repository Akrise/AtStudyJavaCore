package homework_solution.lesson5.task1;

import java.util.Random;

public class Application {
    public static void main(String[] args) {
        Random random = new Random();
        int m = random.nextInt(6) + 5;
        int n = random.nextInt(6) + 5;
        int[] dividends = new int[m];
        int[] dividers = new int[n];
        int[][] matrix = new int[n][m];

        ArrayActions.fillArrayRandom(dividends, 4, 9);
        ArrayActions.fillArrayRandom(dividers, 0, 3);
        ArrayActions.showArray(dividends);
        ArrayActions.showArray(dividers);
        //matrix не используется, присваваем значение для соответствия реализации постановке задачи 1
        matrix = ArrayActions.createMatrix(dividends, dividers);
    }
}
