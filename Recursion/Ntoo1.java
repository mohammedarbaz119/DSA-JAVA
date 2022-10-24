public class Ntoo1 {
    static void printnto1(int n) {
        if (n == 10) {
            return;
        }

        printnto1(n + 1);
        System.out.println(n);
    }

    static void print1ton(int n) {
        if (n == 10) {
            return;
        }
        System.out.println(n);

        printnto1(n + 1);
    }

    public static void main(String[] args) {
        printnto1(1);
        System.out.println("\n1 to N\n");
        print1ton(1);
    }
}
