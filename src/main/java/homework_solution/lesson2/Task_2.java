package homework_solution.lesson2;

public class Task_2 {
    public static void main(String[] args) {
        Task_2 application = new Task_2();
        int[][] chessBoard = new int[8][8];
        application.fillChessArray(chessBoard);
        Task_2.showWithFor(chessBoard);
        Task_2.showWithForeach(chessBoard);
        Task_2.showWithWhile(chessBoard);
    }

    private static void showWithWhile(int[][] chessBoard) {
        int i = 0;
        int j = 0;
        System.out.println("ChessBoard printed with While:");
        while (i < chessBoard.length) {
            while (j < chessBoard[i].length) {
                System.out.print(chessBoard[i][j++]);
            }
            System.out.println();
            j = 0;
            i++;
        }
    }

    private static void showWithForeach(int[][] chessBoard) {
        System.out.println("ChessBoard printed with foreach:");
        for (int[] line : chessBoard) {
            for (int square : line) {
                System.out.print(square);
            }
            System.out.println();
        }
    }

    private static void showWithFor(int[][] chessBoard) {
        System.out.println("ChessBoard printed with for:");
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[i].length; j++) {
                System.out.print(chessBoard[i][j]);
            }
            System.out.println();
        }
    }

    private int[][] fillChessArray(int[][] chessBoard) {
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[i].length; j++) {
                chessBoard[i][j] = ((i + j) % 2);
            }
        }
        return chessBoard;
    }
}
