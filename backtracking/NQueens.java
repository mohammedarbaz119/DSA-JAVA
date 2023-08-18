public class NQueens {
    static int[][] arr;
    static int n;
static int sol = 0;
    static boolean isSafe(int row, int col) {
        for (int i = 0; i < row; i++) {
            if (arr[i][col] == 1) {
                return false;
            }
        }
        
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (arr[i][j] == 1) {
                return false;
            }
        }
        
        for (int i = row, j = col; i >= 0 && j < n; i--, j++) {
            if (arr[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    static void solveNQueens(int row) {
        if (row >= n) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if(arr[i][j]==1){
                        System.out.print(j+1+ " ");
                    }
                }
            }
            System.out.println();
            sol++;
            return;
        }

        for (int i = 0; i < n; i++) {
            if (isSafe(row, i)) {
                arr[row][i] = 1;
                solveNQueens(row + 1);
                arr[row][i] = 0;
            }
        }
    }

    public static void main(String[] args) {
        n = 8; // Change n to the desired board size
        arr = new int[n][n];
        solveNQueens(0);
        System.out.println(sol);
    }
}
