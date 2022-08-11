import java.util.Arrays;

public class Matrixrotateeq {
    public static void main(String[] args) {
        int[][] arr = {
                { 0, 0 }, { 0, 1 }
        };
        int[][] ta = { { 0, 0 }, { 1, 0 } };
        int[][] ad = new int[arr.length][arr.length];
        for (int i = ad.length - 1; i >= 0; i--) {
            for (int j = 0; j < arr.length; j++) {
                ad[i][j] = arr[(arr.length - 1) - i][j];
            }
        }
        for (int i = 0; i < ad.length; i++) {
            for (int j = 0; j < ad.length; j++) {
                if (ad[i][j] != ta[i][j]) {
                    System.out.println(false);
                }
            }
        }
        System.out.println(true);
    }
}
