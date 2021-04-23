package lesson2;

public class Task_6 {
    public static void main(String[] args) {
        Task_5 task4 = new Task_5();
        int dimenshionM = 3 + (int) (Math.random() * 5);
        int dimenshionN = 3 + (int) (Math.random() * 5);
        int[][] inputMatrix = new int[dimenshionM][dimenshionN];
        int[][] outputMatrix;

        for (int i = 0; i < dimenshionM; i++) {
            for (int j = 0; j < dimenshionN; j++) {
                inputMatrix[i][j] = (int) (Math.random() * 2);
            }
        }
        outputMatrix = inputMatrix;
        //Определяем координаты двойки с учетом ограничения на края .
        int invertorTwoMPosition = 1 + (int) (Math.random() * (dimenshionM - 2));
        int invertorTwoNPosition = 1 + (int) (Math.random() * (dimenshionN - 2));
        inputMatrix[invertorTwoMPosition][invertorTwoNPosition] = 2;
        System.out.println("Initial array:");
        Task_5.showMatrix(inputMatrix);
        for (int i = invertorTwoNPosition + 1; i < dimenshionN; i++) {
            outputMatrix[invertorTwoMPosition][i] = inputMatrix[invertorTwoMPosition][i] == 0 ? 1 : 0;
        }
        for (int i = invertorTwoMPosition + 1; i < dimenshionM; i++) {
            for (int j = 0; j < dimenshionN; j++) {
                outputMatrix[i][j] = inputMatrix[i][j] == 0 ? 1 : 0;
            }
        }
        System.out.println("Partially inverted array:");
        Task_5.showMatrix(inputMatrix);

    }
}
