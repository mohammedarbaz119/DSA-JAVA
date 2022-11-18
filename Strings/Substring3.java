public class Substring3 {
    public static void main(String[] args) {
        String a = "abdddeefgfe";
        int c = 0;
        for (int i = 0; i < a.length() - 2; i++) {
            if (a.charAt(i) != a.charAt(i + 1) && a.charAt(i + 1) != a.charAt(i + 2)
                    && a.charAt(i) != a.charAt(i + 2)) {
                c++;
            }

        }
        System.out.println(c);
    }
}
