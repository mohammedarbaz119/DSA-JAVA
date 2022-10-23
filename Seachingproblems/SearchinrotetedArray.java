public class SearchinrotetedArray {
    public static void main(String[] args) {
        int arr[] = { 3, 1 };
        int t = 5;
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
        System.out.println(ans);

        // int lbleft = 0, hbleft = h, lbright = h + 1, hbright = arr.length - 1;
        // int leftpos = -1, rightpos = -1;
        // while (lbleft <= hbleft) {
        // System.out.println(hbleft);
        // int mid = lbleft + (hbleft - lbleft) / 2;
        // if (arr[mid] == t) {
        // leftpos = mid;
        // break;
        // } else if (arr[mid] > t) {
        // hbleft = mid - 1;
        // } else {
        // lbleft = mid + 1;
        // }
        // }

        // while (lbright <= hbright) {
        // int mid = lbright + (hbright - lbright) / 2;

        // if (arr[mid] == t) {
        // rightpos = mid;
        // break;
        // } else if (arr[mid] > t) {
        // hbright = mid - 1;
        // } else {
        // lbright = mid + 1;
        // }
        // }

        // if (leftpos == -1) {
        // System.out.println(rightpos);
        // } else {
        // System.out.println(leftpos);
        // }
    }
}
