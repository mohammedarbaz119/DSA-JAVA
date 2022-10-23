public class MountainArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 5, 4, 3, 2, 1 };
        int t = 3;
        int l = 0, h = arr.length - 1;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (arr[mid] < arr[mid + 1]) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }

        int lbleft = 0, hbleft = l, lbright = l, hbright = arr.length - 1;
        int leftpos = -1, rightpos = -1;
        while (lbleft <= hbleft) {
            int mid = lbleft + (hbleft - lbleft) / 2;
            if (arr[mid] == t) {
                leftpos = mid;
                break;
            } else if (arr[mid] > t) {
                hbleft = mid - 1;
            } else {
                lbleft = mid + 1;
            }
        }
        while (lbright <= hbright) {
            int mid = lbright + (hbright - lbright) / 2;
            if (arr[mid] == t) {
                rightpos = mid;
                break;
            } else if (arr[mid] > t) {
                lbright = mid + 1;
            } else {
                hbright = mid - 1;
            }
        }
        if (leftpos == -1 && rightpos == -1) {
            System.out.println(-1);
        } else if (leftpos == -1) {
            System.out.println(rightpos);
        }
        System.out.println(leftpos);
        System.out.println(leftpos + " " + rightpos);
    }
}
