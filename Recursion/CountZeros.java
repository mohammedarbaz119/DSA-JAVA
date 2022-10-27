public class CountZeros {
    static int count(int n, int x) {
        if (n == 0) {
            return x;
        }
        if (n % 10 == 0) {
            x++;
        }
        return count(n / 10, x);

    }

    public static void main(String[] args) {
        int n = 10203040;
        System.out.println(count(n, 0));
    }
}
