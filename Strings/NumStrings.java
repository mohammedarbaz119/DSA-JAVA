public class NumStrings {
    static int Numstr(String a[], String b, int idx, int co) {
        if (idx == a.length) {
            return co;
        }
        int i = 0;
        while (i < b.length()) {
            if (b.substring(i, i + a[idx].length()).compareTo(a[idx]) == 0) {
                co++;
                break;

            }
            i++;

        }
        return Numstr(a, b, idx + 1, co);

    }

    public static void main(String[] args) {
        String a[] = { "a", "b", "bc", "d" };
        String word = "abc";
        System.out.println(Numstr(a, word, 0, 0));
    }
}
