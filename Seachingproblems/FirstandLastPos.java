public class FirstandLastPos {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 4, 4, 4, 5 };
        int t = 4;
        int l = 0, h = arr.length - 1;
        int fp = -1, lp = -1;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (arr[mid] == t) {
                fp = mid;
                h = mid - 1;
            } else if (arr[mid] > t) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        l = fp;
        h = arr.length - 1;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (arr[mid] == t) {
                lp = mid;
                l = mid + 1;
            } else if (arr[mid] > t) {
                h = mid - 1;
            } else {

            }
        }
        System.out.println(fp + " " + lp);

        // while (l <= h) {
        // int mid = l + (h - l) / 2;
        // if (arr[mid] == t) {

        // } else if (arr[mid] > t) {
        // h = mid - 1;
        // } else {
        // l = mid + 1;
        // }
        // }
        // System.out.println(fp + " " + lp);
    }
}
