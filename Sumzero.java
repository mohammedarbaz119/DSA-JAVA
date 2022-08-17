import java.io.Console;

public class Sumzero {
    public static void main(String[] args) {
        int k = 10;
        int s = 9;
        int a[] = new int[k];
        int b[] = new int[s];
        int pos = 0;

        if (k % 2 == 0) {

            for (int i = -k; i <= k; i += 2) {
                if (i == 0) {
                    continue;
                }
                a[pos] = i;
                pos++;

            }
        }
        pos = 0;
        for (int i = (-s) + 2; i <= s - 2; i += 2) {
            b[pos] = i;
            pos++;
        }

        // int sum = 0;
        // for (int i = 0; i < a.length; i++) {
        // sum += a[i];
        // }

    }

}
