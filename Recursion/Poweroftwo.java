public class Poweroftwo {
    static boolean ispoweroftwo(int n) {
        if (n == 0) {
            return false;
        }
        if (n == 1 || (n % 2 == 0 && ispoweroftwo(n / 2))) {
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        int n = 32;
        System.out.println(ispoweroftwo(n));
    }
}
