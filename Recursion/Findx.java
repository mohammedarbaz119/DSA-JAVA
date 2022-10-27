public class Findx {
    static int Find_the_x(int n, int a, int x) {
        if (n == 1) {
            return x;
        }
        x++;
        return Find_the_x(n / a, a, x);

    }

    public static void main(String[] args) {
        int n = 32, a = 2;
        System.out.println(Find_the_x(n, a, 0));
    }
}
