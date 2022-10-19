import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Targetaftersorting {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 5, 2, 3 };
        int l = 0, h = arr.length - 1;
        int t = 5;
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int te = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = te;
                }
            }
        }
        int b = 0;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (arr[mid] == t) {

                b = mid;
                h = mid - 1;
            } else if (arr[mid] > t) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }

        }
        System.out.println(b);
        while (b < arr.length && arr[b] == t) {
            a.add(b);
            b++;
        }
        System.out.println(a);
    }
}
