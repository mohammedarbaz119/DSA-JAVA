import java.util.ArrayList;
import java.util.Arrays;

public class SumTraingle {
    static void trainglesum(int arr[], int n) {
        if (n <= 0) {
            return;
        }
        int arr1[] = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            arr1[i] = arr[i] + arr[i + 1];
        }
        trainglesum(arr1, n - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        trainglesum(arr, arr.length);
    }
}