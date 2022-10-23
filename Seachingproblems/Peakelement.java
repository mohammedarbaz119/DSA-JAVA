public class Peakelement {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 1, 3, 5, 6, 4 };
        int l = 0, h = arr.length - 1;
        while (l < h) {
            int mid = l + (h - l) / 2;
            if (arr[mid] > arr[mid + 1]) {
                h = mid;

            } else {
                l = mid + 1;
            }
        }
    }
}
