import java.util.Arrays;

public class SelectionSort {
    static void swap(int arr[], int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 5, 1, 4 };
        for (int i = 0; i < arr.length; i++) {
            int ma = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[ma] > arr[j]) {
                    ma = j;
                }
            }
            if (ma != i) {
                swap(arr, i, ma);
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
