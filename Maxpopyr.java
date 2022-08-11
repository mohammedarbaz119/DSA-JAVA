import java.util.HashMap;

public class Maxpopyr {
    public static void main(String[] args) {
        int[][] a = {
                { 1950, 1961 }, { 1960, 1971 }, { 1970, 1981 } };
        // HashMap<Integer, Integer> cc = new HashMap<>();
        int m = Integer.MIN_VALUE;
        int count = 0;
        for (int i = 1950; i <= 2050; i++) {
            int c = 0;

            for (int j = 0; j < a.length; j++) {

                if (i >= a[j][0] && i < a[j][1]) {
                    c++;
                }

            }
            if (c > count) {
                count = c;
                m = i;
            }
            if (m == Integer.MIN_VALUE && c > count) {
                m = i;
                count = c;
            }

        }
        System.out.println(m);

    }

}
