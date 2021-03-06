package homework_solution.lesson2;

import homework_solution.lesson2.matrix.MatrixActions;

public class Task_5 {

    public static void main(String[] args) {
        int dimenshionM = 3 + (int) (Math.random() * 5);
        int dimenshionN = 3 + (int) (Math.random() * 5);
        int[][] inputMatrix = new int[dimenshionM][dimenshionN];
        int[][] outputMatrix = new int[dimenshionN][dimenshionM];

        for (int i = 0; i < dimenshionM; i++) {
            for (int j = 0; j < dimenshionN; j++) {
                inputMatrix[i][j] = (int) (Math.random() * 100);
                outputMatrix[j][i] = inputMatrix[i][j];
            }

        }
        System.out.println("Исходная матрица:");
        MatrixActions.showMatrix(inputMatrix);
        System.out.println("Транспонированная матрица:");
        MatrixActions.showMatrix(outputMatrix);
    }
}
