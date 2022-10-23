import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionofArray {
    public static void main(String[] args) {
        int arr[] = { 4, 9, 5 };
        int arr1[] = { 9, 4, 9, 8, 4 };
        ArrayList<Integer> a = new ArrayList<>();
        Arrays.sort(arr1);
        for (int i = 0; i < arr.length; i++) {
            int l = 0, h = arr1.length - 1;
            int t = arr[i];
            int ans = -1;
            while (l <= h) {
                int mid = l + (h - l) / 2;
                if (arr1[mid] == t) {
                    ans = mid;
                    break;
                } else if (arr1[mid] > t) {
                    h = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
            if (ans != -1) {

                a.add(arr[i]);

            }
        }
        int arr2[] = new int[a.size()];
        for (int i = 0; i < a.size(); i++) {
            arr2[i] = a.get(i);
        }
        System.out.println(a);
    }
}
