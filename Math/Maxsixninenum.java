public class Maxsixninenum {
    public static void main(String[] args) {
        int n = 69696969, m = n;
        int ten = -1, cur = 0;

        while (m > 0) {
            if (m % 10 == 6) {
                ten = cur;
            }
            m = m / 10;
            cur++;
        }
        System.out.println();
    }
}
