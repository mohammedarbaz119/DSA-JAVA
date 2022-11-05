public class NUmofmaxSUbstrings {
    static int Numofsubstrings(String a, String b, int num, String c) {
        int i = 0;
        System.out.println(c);
        while (i + b.length() <= a.length()) {
            if (a.substring(i, i + b.length()).compareTo(b) == 0) {
                return Numofsubstrings(a, b + "" + c, num + 1, c);
            }
            i++;
        }
        return num;

    }

    public static void main(String[] args) {
        String word = "aaabaaaabaaabaaaabaaaabaaaabaaaaba";
        String ab = "aaaba";
        System.out.println(Numofsubstrings(word, ab, 0, new String(ab)));
    }
}
