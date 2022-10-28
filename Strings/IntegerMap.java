import java.io.StringReader;
import java.util.HashMap;

public class IntegerMap {
    static String intmap(String a) {
        String f = "";
        int i = 0;
        while (i < a.length()) {
            if (i < a.length() - 2 && a.charAt(i + 2) == '#') {
                String c = a.substring(i, i + 2);
                char d = (char) (Integer.parseInt(c) + 96);
                // System.out.println(d);
                f += d;
                i += 3;
            } else {
                int g = Integer.parseInt(a.substring(i, i + 1));
                char s = (char) (g + 96);
                f += s;
                i++;
            }

        }
        return f;
    }

    public static void main(String[] args) {
        String a = "10#11#12#12326#";
        System.out.println(intmap(a));
    }
}
