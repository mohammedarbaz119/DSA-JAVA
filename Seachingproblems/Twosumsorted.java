
public class Twosumsorted {
    public static int name(int[] arr, int ta, int i) {
        int j = arr.length - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (arr[mid] == ta) {
                return mid;
            } else if (arr[mid] > ta) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 7, 11, 15 };
        int t = 9;
        int[] a = new int[2];
        for (int i = 0; i < arr.length; i++) {
            int k = name(arr, t - arr[i], i + 1);
            if (k != -1) {
                a[0] = i + 1;
                a[1] = k + 1;
            }

        }
        System.out.println(a[0] + " " + a[1]);

    }
}
