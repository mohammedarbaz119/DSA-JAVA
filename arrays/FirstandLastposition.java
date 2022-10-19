public class FirstandLastposition {
    public static void main(String[] args) {
        int arr[] = { 1 };
        int t = 1;
        int a[] = { -1, -1 };
        int l = 0, h = arr.length - 1;
        while (l <= arr.length - 1 && h >= 0) {
            if (arr[h] == t && a[1] == -1) {
                a[1] = h;
            }
            if (arr[l] == t && a[0] == -1) {
                a[0] = l;
            }
            if (a[0] != -1 && a[1] != -1) {
                break;
            }
            l++;
            h--;
        }
        System.out.println(a[0] + " " + a[1]);
    }
}
