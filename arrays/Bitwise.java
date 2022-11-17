public class Bitwise {
    public static void main(String[] args) {
        int n = 4, s = 3, sb = 3, i = 1;
        int b = s;
        while (i < n) {
            sb = s + 2 * i;
            i++;
            b = b ^ sb;
        }
        System.out.println(b);

    }
}
