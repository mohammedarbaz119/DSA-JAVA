import java.util.Arrays;

public class MergeSortArr {
    public static void main(String[] args) {
        int num1[] = { 2, 0 };
        int num2[] = { 1 };
        int m = 1, n = 1;

        if (m == 0) {
            for (int i = 0; i < n; i++) {
                num1[i] = num2[i];
            }
            System.out.println(Arrays.toString(num1));
            return;
        } else if (n == 0) {
            System.out.println(Arrays.toString(num1));
            return;
        } else {
            int i = m - 1, j = n - 1, k = num1.length - 1;
            while (i >= 0 && j >= 0) {
                System.out.println(Arrays.toString(num1));
                if (num1[i] <= num2[j]) {
                    num1[k] = num2[j];
                    k--;
                    j--;
                } else if (num1[i] > num2[j]) {
                    num1[k] = num1[i];
                    i--;
                    k--;
                }

            }
            if (i > 0) {
                while (i >= 0) {
                    num1[k] = num1[i];
                    k--;
                    i--;
                }
            }
            if (j > 0) {
                while (j >= 0) {
                    num1[k] = num2[j];
                    k--;
                    j--;
                }
            }
            System.out.println(Arrays.toString(num1));

        }
    }

}
