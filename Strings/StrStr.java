public class StrStr {
    static int pos(String a, String b) {
        int i = 0, j = b.length();
        while (j < a.length()) {
            if (a.substring(i, j).compareTo(b) == 0) {
                return i;
            }
            i++;
            j++;
        }
        return -1;
    }

    public static void main(String[] args) {
        String a = "mississippi";
        String b = "issip";
        System.out.println(pos(a, b));

    }
}
