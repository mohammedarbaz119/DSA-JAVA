public class RotationCount {
    public static void main(String[] args) {
        int arr[] = { 15, 18, 1, 2, 3, 6, 12 };
        int l = 0, h = arr.length - 1;
        int ans = -1;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (mid < h && arr[mid] > arr[mid + 1]) {
                ans = mid;
                break;
            } else if (arr[mid] < arr[mid - 1]) {
                ans = mid - 1;
                break;
            } else if (arr[l] >= arr[mid]) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        System.out.println(ans + 1);
    }
}
