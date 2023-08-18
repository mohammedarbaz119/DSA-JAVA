import java.util.Arrays;

public class KNAPSACK01S {
    static void knap(int[] p, int[] w, int cap) {
        int[] ans = new int[p.length];
        int[][] arr = new int[p.length + 1][cap + 1];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = 0;
            }
        }
        for (int i = 0; i < p.length; i++) {
            if (w[i] <= cap) {
                arr[i + 1][w[i]] = p[i];

            }
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr[0].length; j++) {

                if (j - w[i - 1] > 0) {
                    arr[i][j] = Math.max(arr[i - 1][j], arr[i - 1][j - w[i - 1]] + p[i - 1]);
                } else {
                    arr[i][j] = Math.max(arr[i - 1][j], arr[i][j]);
                }

            }
        }
        int k = p.length;
        while (cap > 0 && k > 0) {
            if (arr[k][cap] != arr[k - 1][cap]) {
                ans[k - 1] = 1;
                cap = cap - w[k - 1];
                k--;
            } else {
                ans[k - 1] = 0;
                k--;
            }
        }
        System.out.println(Arrays.toString(ans));
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] p = { 1, 2, 3 };
        int[] values = { 4, 5, 1};
        int cap = 4;
        knap(p, values, cap);
    }
}
