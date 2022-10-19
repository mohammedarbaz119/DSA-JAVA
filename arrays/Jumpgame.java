public class Jumpgame {
    public static boolean jump(int n, int arr[]) {
        if (arr[n] + arr[n - 1] >= n) {
            return false;
        }
        if (n == 0) {
            return true;
        }
        return jump(n - 1, arr);
    }

    public static void main(String[] args) {
        int[] arr = { 3, 2, 1, 1, 4 };
        // boolean b = true;
        // int j = 0;
        // for (int i = 0; i < arr.length; i++) {
        // if (i > j) {
        // System.out.println(false);
        // break;
        // }
        // if ((i + arr[i]) > j) {
        // j = arr[i] + i;
        // }
        // System.out.println(j);

        // }
        // System.out.println(true);
        int n = arr.length - 1;
        boolean b = jump(n, arr);
        System.out.println(b);
    }
}
