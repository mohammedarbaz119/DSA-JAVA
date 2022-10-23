public class PeakindexinMountian {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 4, 3, 2, 1 };
        int l = 0, h = arr.length - 1;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (arr[mid] > arr[mid + 1]) {
                h = mid - 1;

            } else {
                l = mid + 1;
            }
        }
        System.out.println(l);
    }
}
