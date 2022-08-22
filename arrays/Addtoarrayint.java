import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Addtoarrayint {

    public static void main(String[] args) {
        int ar[] = { 4, 9 };
        int k = 983;
        String c = String.valueOf(k);
        String[] kk = c.split("");
        int[] b = new int[kk.length];
        for (int i = 0; i < b.length; i++) {
            b[i] = Integer.parseInt(kk[i]);
        }
        List<Integer> a = new ArrayList<>();
        int i = ar.length - 1;
        int j = b.length - 1;
        int carry = 0;
        System.out.println(Arrays.toString(ar));
        System.out.println(Arrays.toString(b));
        while (j >= 0 && i >= 0) {

            int ca = ar[i] + b[j];
            if (carry == 0 && ca > 9) {
                int aa = ca % 10;
                carry = ca / 10;
                a.add(aa);

            } else if (carry > 0 && ca <= 9) {
                if (carry + ca >= 10) {
                    int abba = (carry + ca) % 10;
                    a.add(abba);
                    carry = (carry + ca) / 10;
                } else {
                    a.add(carry + ca);
                    carry = 0;
                }

            } else if (carry > 0 && ca >= 10) {
                a.add((ca + carry) % 10);
                carry = ca / 10;
            } else {
                a.add(ca);
            }

            i--;
            j--;
        }

        if (j >= 0) {
            while (j >= 0) {
                if (carry > 0) {
                    int ca = (b[j] + carry) % 10;
                    a.add(ca);
                    carry = (b[j] + carry) / 10;
                } else {
                    a.add(b[j]);

                }
                j--;
            }
        } else if (i >= 0) {
            while (i >= 0) {

                if (carry > 0) {
                    int ca = (ar[i] + carry) % 10;
                    a.add(ca);
                    carry = (ar[i] + carry) / 10;

                } else {
                    a.add(ar[i]);

                }
                i--;
            }

        }
        if (carry > 0) {
            if (carry > 10) {
                int cc = carry % 10;
                a.add(cc);
                int ccc = carry / 10;
                a.add(ccc);
            } else {
                a.add(carry);
            }
        }
        Collections.reverse(a);
        System.out.println(a);
    }
}
