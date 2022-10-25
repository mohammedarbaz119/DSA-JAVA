public class Multiply {
    static int mul(int i, int j) {
        if (j == 0) {
            return 0;
        }
        return i + mul(i, j - 1);
    }

    public static void main(String[] args) {
        int d = 10, d1 = 220;
        System.out.println(mul(d, d1));
    }
}
