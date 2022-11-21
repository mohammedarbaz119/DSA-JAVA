public class Substring3 {
    static int pcu(int a) {
        return a;
    }

    public static void main(String[] args) {
        Substring3 s = new Substring3();
        System.out.println(s.pcu(0));
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
