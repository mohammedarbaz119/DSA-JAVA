public class Pivot {
    static int sum(int arr[], int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += arr[i];

        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 3, 2, 1 };
        for (int i = 0; i < arr.length; i++) {
            int lefts = sum(arr, 0, i - 1);
            int rights = sum(arr, i + 1, arr.length - 1);
            System.out.println(lefts + " " + rights);
            if (lefts == rights) {
                System.out.println(i);
            }
        }
    }
}
