public class Numberofstepstozero {
    static int steps(int n, int x) {
        if (n == 0) {
            return x;
        }
        if (n % 2 == 0) {
            return steps(n / 2, x + 1);
        }
        return steps(n - 1, x + 1);

    }

    public static void main(String[] args) {
        int n = 43;
        System.out.println(steps(n, 0));

    }
}
