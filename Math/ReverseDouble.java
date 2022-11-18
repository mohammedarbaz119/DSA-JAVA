public class ReverseDouble {
    static int rev(int n) {
        int m = 0;
        while (n > 0) {
            System.out.println(n);
            int d = n % 10;
            m = m * 10 + d;
            n = n / 10;
        }
        return m;
    }

    public static void main(String[] args) {
        int n = 12300;
        System.out.println(rev(n));
    }
}
