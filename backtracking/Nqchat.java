public class Nqchat {

    private static int N;
    private static int[][] board;

    public static void solveNQueens(int n) {
        N = n;
        board = new int[N][N];
        solveNQueensUtil(0);
    }

    private static void solveNQueensUtil(int row) {
        if (row == N) {
            printSolution();
            return;
        }

        for (int col = 0; col < N; col++) {
            if (isSafe(row, col)) {
                board[row][col] = 1;
                solveNQueensUtil(row + 1);
                board[row][col] = 0;
            }
        }
    }

    private static boolean isSafe(int row, int col) {
        for (int prevRow = 0; prevRow < row; prevRow++) {
            if (board[prevRow][col] == 1 || 
                (col - prevRow >= 0 && board[row - prevRow][col - prevRow] == 1) || 
                (col + prevRow < N && board[row - prevRow][col + prevRow] == 1)) {
                return false;
            }
        }
        return true;
    }

    private static void printSolution() {
        for (int[] row : board) {
            for (int cell : row) {
                System.out.print(cell == 1 ? "Q " : ". ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 4; // Change n to the desired board size
        solveNQueens(n);
    }
}