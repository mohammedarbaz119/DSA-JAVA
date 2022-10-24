import java.util.Arrays;

public class ReverseStringRecursion {
    static void Rev(char[] s, int i, int j) {
        if (i >= j) {
            return;
        }
        char t = s[i];
        s[i] = s[j];
        s[j] = t;
        Rev(s, i + 1, j - 1);
    }

    public static void main(String[] args) {
        char[] a = { 'a', 'r', 'b', 'a', 'z' };
        Rev(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }
}
