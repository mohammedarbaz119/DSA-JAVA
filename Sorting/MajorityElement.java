import java.util.Arrays;

public class MajorityElement {
    static void swap(int arr[], int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    static void sort(int arr[], int n) {
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
        sort(arr, n - 1);
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 3 };
        sort(arr, arr.length - 1);
        int max = 0;
        int i = 0;
        int j = 1;
        int c = 1;
        while (i < arr.length && j < arr.length) {
            if (arr[i] != arr[j]) {

                if (c > arr.length / 2) {
                    max = arr[i];
                    break;
                }
                i = j;

                c = 0;
            }

            j++;
            c++;
        }

        if (c > arr.length / 2) {
            max = arr[i];

        }
        System.out.println(max);
    }
}
