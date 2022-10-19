import java.util.HashSet;
import java.util.Set;

public class Containsduplicate {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 3 };
        Set<Integer> a = new HashSet<>();
        int k = 3;
        int i = 0, j = k;
        if (k >= arr.length) {
            j = arr.length - 1;
        }
        while (i < arr.length && j < arr.length) {
            int t = i;
            while (j - t > 0) {
                if (a.contains(arr[t])) {
                    System.out.println(true);
                    break;
                }
                a.add(arr[t]);
                t++;
            }
            i += 1;
            j += 1;

        }
        // System.out.println(j);
        // if (i < arr.length) {
        // j = arr.length - 1;
        // while (i < arr.length) {
        // int t = j;
        // while (t - i > 0) {
        // if (arr[i] == arr[j]) {
        // System.out.println(true);
        // break;
        // }
        // t--;
        // }
        // System.out.println(j + " " + i);
        // i++;
        // }
        // }

        System.out.println(false);
    }
}
