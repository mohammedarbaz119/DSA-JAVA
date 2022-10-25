public class Sumof1ton {
    static int sumo(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumo(n - 1);
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println(sumo(n));
    }
}
