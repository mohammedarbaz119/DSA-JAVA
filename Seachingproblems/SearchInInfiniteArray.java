import java.util.Arrays;

public class SearchInInfiniteArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 5, 6, 7, 8, 9, 10, 13, 14, 15, 16, 17, 18, 19, 21, 23 };
        int t = 14;
        int s = 0;
        int e = 1;
        while (t > arr[e]) {
            int te = e + 1;
            e = e + (e - s + 1) * 2;
            s = te;
        }
        int f = Arrays.binarySearch(arr, s, e, t);
        System.out.println(f);
    }
}
