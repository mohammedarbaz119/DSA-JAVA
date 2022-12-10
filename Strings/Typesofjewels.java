public class Typesofjewels {
    public static void main(String[] args) {
        String a = "aAAbbbb";
        String b = "aA";
        int c = 0;
        for (int i = 0; i < b.length(); i++) {
            for (int j = 0; j < a.length(); j++) {
                if (b.charAt(i) == a.charAt(j)) {
                    c++;
                }
            }
        }

    }
}
