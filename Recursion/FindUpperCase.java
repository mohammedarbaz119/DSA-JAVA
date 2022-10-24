public class FindUpperCase {
    static char uppere(String a, int i) {
        if (Character.isUpperCase(a.charAt(i))) {
            return a.charAt(i);
        }
        return uppere(a, i - 1);
    }

    public static void main(String[] args) {
        String a = "mohammEd arbaz";
        System.out.println(uppere(a, a.length() - 1));
    }
}