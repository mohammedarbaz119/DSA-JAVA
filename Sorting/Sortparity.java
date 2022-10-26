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
        while (i <= j) {
            if (arr[i] % 2 == 0) {

                i++;

            } else {
                swap(arr, i, j);
                j--;
            }

        }

        System.out.println(Arrays.toString(arr));
    }
}