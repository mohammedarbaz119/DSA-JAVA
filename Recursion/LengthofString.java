public class LengthofString {
    public static int Len(String a) {

        if (a.equals("")) {
            return 0;
        }

        return 1 + Len(a.substring(1));
    }

    public static void main(String[] args) {
        String a = "arbaz uddin qureshi is learning recursion";
        int as = Len(a);
        System.out.println(as);
    }
}
