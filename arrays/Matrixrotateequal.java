import java.util.Arrays;

public class Matrixrotateequal {
    public static int[][] rotate(int[][] arr) {
        int n = arr.length;
        int[][] res = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                res[i][j] = arr[(arr.length - 1) - j][i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] arr = {
                { 0, 0, 0 }, { 0, 1, 0 }, { 1, 1, 1 }
        };
        int[][] ta = { { 1, 1, 1 }, { 0, 1, 0 }, { 0, 0, 0 } };

        boolean b = true;
        if (arr == ta) {
            System.out.println(true);
        }
        for (int k = 1; k <= 3; k++) {
            b = true;
            arr = rotate(arr);
            for (int i = 0; i < ta.length; i++) {
                for (int j = 0; j < ta.length; j++) {
                    if (arr[i][j] != ta[i][j]) {
                        b = false;
                    }
                    System.out.println(arr[i][j]);
                }
            }
            if (b == true) {
                break;
            }
            System.out.println("\n");
        }
        System.out.println(b);
    }

}
