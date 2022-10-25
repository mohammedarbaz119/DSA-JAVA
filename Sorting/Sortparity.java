import java.util.Arrays;

public class Sortparity {
    static void swap(int arr[], int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 0, 1 };
        int i = 0, j = arr.length - 1;
        int d = 0;
        while (i <= j) {
            if (arr[d] % 2 == 0) {
                swap(arr, i, d);
                i++;

            } else {
                swap(arr, d, j);
                j--;
                i++;
            }
            d++;

        }

        System.out.println(Arrays.toString(arr));
    }
}