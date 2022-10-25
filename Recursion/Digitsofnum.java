public class Digitsofnum {
    static int sumofdigits(int d) {
        if (d <= 0) {
            return 0;
        }
        return (d % 10) + sumofdigits(d / 10);

    }

    public static void main(String[] args) {
        int d = 12345;
        System.out.println(sumofdigits(d));
    }
}
