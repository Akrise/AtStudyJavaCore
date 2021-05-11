package matrix;

public class MatrixActions {
    public static void showMatrix(int[][] inputMatrix) {
        for (int i = 0; i < inputMatrix.length; i++) {
            for (int j = 0; j < inputMatrix[i].length; j++) {
                System.out.printf("%3d ", inputMatrix[i][j]);
            }
            System.out.println();
        }
    }

}
