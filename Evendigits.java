public class Evendigits {
    public static int noofdigits(int n) {
        int c = 0;
        while (n > 0) {
            int d = n % 10;
            c++;
            n = n / 10;
        }
        return c;
    }

    public static void main(String[] args) {
        int c = 0;
        int ar[] = { 12, 345, 2, 6, 7896 };
        for (int i = 0; i < ar.length; i++) {
            if (noofdigits(ar[i]) % 2 == 0) {
                c++;
            }
        }
        System.out.println(c);

    }
}
