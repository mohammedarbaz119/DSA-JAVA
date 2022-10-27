public class Poweroftwo {
    static boolean ispoweroftwo(int n) {
        if (n == 0) {
            return false;
        }
        if (n == 1) {
            return true;
        }
        if (n % 2 == 0) {
            return ispoweroftwo(n / 2);
        }
        return false;

    }

    public static void main(String[] args) {
        int n = 24;
        System.out.println(ispoweroftwo(n));
    }
}
