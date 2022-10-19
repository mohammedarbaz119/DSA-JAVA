public class CeilingNum {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 5, 8, 14, 16, 18, 19 };
        int t = 13;
        int l = 0, h = arr.length - 1;
        int ans = -1;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (arr[mid] < t) {
                l = mid + 1;
            } else if (arr[mid] > t) {
                h = mid - 1;
            } else {
                System.out.println(arr[mid]);
                break;
            }
        }
        System.out.println(arr[l]);
    }
}
