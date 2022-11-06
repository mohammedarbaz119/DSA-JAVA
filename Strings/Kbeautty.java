import javax.print.DocFlavor.STRING;

public class Kbeautty {
    static int divisorSubstrings(int num, int k) {
        String a = String.valueOf(num);
        int c = 0;
        for (int i = 0; i <= a.length() - k; i++) {
            String b = a.substring(i, i + k);
            if (num % Integer.valueOf(b) == 0) {
                c++;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        int num = 240, k = 2;
        System.out.println(divisorSubstrings(num, k));
    }
}
