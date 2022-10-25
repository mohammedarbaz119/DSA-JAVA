public class Prime {
    static boolean isprime(int p, int i) {

        if (p % i == 0) {
            return false;
        }
        if (p == i * i && p % i == 0) {
            return false;
        }
        if (i * i > p) {
            return true;
        }
        return isprime(p, i + 1);

    }

    public static void main(String[] args) {
        int p = 23;
        System.out.println(isprime(p, 2));
    }
}
