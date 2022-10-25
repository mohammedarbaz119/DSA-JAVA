public class Geeknonacci {
    public static int geeknonacci(int a, int b, int c, int n) {
        if (n - 4 == 0) {
            return a + b + c;
        }
        return geeknonacci(b, c, a + b + c, n - 1);

    }

    public static void main(String[] args) {
        int a = 1, b = 3, c = 2;
        int s = geeknonacci(a, b, c, 6);
        System.out.println(s);
    }
}
