public class Numoftimetomakezero {
    static int numoftime(int n, int c, int s) {
        if (n == 0 || c == 0) {
            return s;
        }
        if (c > n) {
            return numoftime(c, n, s);
        }
        return numoftime(n - c, c, s + 1);
    }

    public static void main(String[] args) {
        int n = 10, c = 3;
        System.out.println(numoftime(n, c, 0));
    }
}
