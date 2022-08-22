import java.util.ArrayList;
import java.util.List;

public class LuckyNumber {
    public static boolean Luckynumbercol(int arr[][], int n, int j) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][j] > n) {
                return false;
            }
        }
        return true;
    }

    public static boolean Luckynumberrow(int arr[][], int n, int row) {
        for (int i = 0; i < arr[row].length; i++) {
            if (arr[row][i] < n) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 10, 4, 2 }, { 9, 3, 8, 7 }, { 15, 16, 17, 12 } };
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (Luckynumbercol(arr, arr[i][j], j) && Luckynumberrow(arr, arr[i][j], i)) {
                    a.add(arr[i][j]);
                }
            }
        }
        System.out.println(a);
    }
}
