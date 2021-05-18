package homework_solution.lesson2;

import homework_solution.lesson2.matrix.MatrixActions;

public class Task_6 {
    public static void main(String[] args) {
        Task_5 task4 = new Task_5();
        int dimensionM = 3 + (int) (Math.random() * 5);
        int dimensionN = 3 + (int) (Math.random() * 5);
        int[][] inputMatrix = new int[dimensionM][dimensionN];
        int[][] outputMatrix;

        for (int i = 0; i < dimensionM; i++) {
            for (int j = 0; j < dimensionN; j++) {
                inputMatrix[i][j] = (int) (Math.random() * 2);
            }
        }
        outputMatrix = inputMatrix;
        //Определяем координаты двойки с учетом ограничения на края .
        int inverterTwoMPosition = 1 + (int) (Math.random() * (dimensionM - 2));
        int inverterTwoNPosition = 1 + (int) (Math.random() * (dimensionN - 2));
        inputMatrix[inverterTwoMPosition][inverterTwoNPosition] = 2;
        System.out.println("Initial array:");
        MatrixActions.showMatrix(inputMatrix);
        for (int i = inverterTwoNPosition + 1; i < dimensionN; i++) {
            outputMatrix[inverterTwoMPosition][i] = inputMatrix[inverterTwoMPosition][i] == 0 ? 1 : 0;
        }
        for (int i = inverterTwoMPosition + 1; i < dimensionM; i++) {
            for (int j = 0; j < dimensionN; j++) {
                outputMatrix[i][j] = inputMatrix[i][j] == 0 ? 1 : 0;
            }
        }
        System.out.println("Partially inverted array:");
        MatrixActions.showMatrix(inputMatrix);

    }
}
