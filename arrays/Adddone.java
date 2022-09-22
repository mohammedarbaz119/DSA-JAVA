import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Adddone {
    public static void main(String[] args) {
        int[] arr = { 9, 9, 9, 9, 9, 9, 9 };
        List<Integer> a = new ArrayList<>();
        int carry = 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            int c = arr[i] + carry;
            if (c <= 9) {
                a.add(c);
                carry = 0;
            } else {
                a.add(0);
                carry = 1;
            }

        }
        if (carry >= 1) {
            a.add(carry);
        }

        Collections.reverse(a);
        int[] newarr = new int[a.size()];
        for (int i = 0; i < a.size(); i++) {
            newarr[i] = a.get(i);
        }
        System.out.println(a);
    }
}
