public class Conseqones {
    static boolean isconsq(String a, int n) {
        if (n == 0) {
            return false;
        }
        if (a.charAt(n) == '1' && a.charAt(n - 1) == '1') {
            return true;
        }
        return isconsq(a, n - 1);
    }

    public static void main(String[] args) {
        String a = "1000101011000";
        System.out.println(isconsq(a, a.length() - 1));

    }
}
