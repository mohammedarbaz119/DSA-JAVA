public class Maxandmin {
    public static double powr(double i, int n) {
        if (n == 1) {
            return i;
        } else {
            return i * powr(i, n - 1);
        }
    }

    public static double negatpow(int i, int n) {

        double x = powr(i, n);
        return 1 / x;

    }

    public static void main(String[] args) {
        int x = 10, n = -2;

        if (n < 0) {
            System.out.println(negatpow(x, -n));
        }

        // System.out.println(powr(x, n));
    }
}
