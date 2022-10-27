public class Arrayissorted {
    static boolean isSort(int arr[], int n) {
        if (n == 0) {
            return true;
        }
        if (arr[n] < arr[n - 1]) {
            return false;
        }
        return isSort(arr, n - 1);

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2324, 3243, 4, 5 };
        System.out.println(isSort(arr, arr.length - 1));
    }
}
