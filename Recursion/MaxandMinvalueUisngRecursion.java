public class MaxandMinvalueUisngRecursion {
    static int Min(int arr[], int n, int min) {
        if (n == arr.length - 1) {
            return min;
        }
        min = Math.min(arr[n], min);

        return Min(arr, n + 1, min);

    }

    static int Max(int arr[], int n, int min) {
        if (n == arr.length) {
            return min;
        }
        min = Math.max(arr[n], min);

        return Max(arr, n + 1, min);

    }

    public static void main(String[] args) {
        int arr[] = { 1, -2, 3, -4, 5 };
        System.out.println(Min(arr, 1, arr[0]));
        System.out.println(Max(arr, 0, arr[0]));
    }
}
