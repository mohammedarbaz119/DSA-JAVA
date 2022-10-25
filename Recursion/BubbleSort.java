import java.util.Arrays;

public class BubbleSort {
    static void swap(int arr[], int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    static void sort(int arr[], int n, int c) {
        boolean b = false;

        if (n == 1) {
            return;
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] > arr[i + 1]) {
                swap(arr, i, i + 1);
                b = true;
            }
        }

        if (!b) {
            return;
        }
        sort(arr, n - 1, c);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 4, 2, 5, 2 };
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
