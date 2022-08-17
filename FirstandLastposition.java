public class FirstandLastposition {
    public static void main(String[] args) {
        int[] arr = {
                5, 7, 7, 8, 8, 10
        };
        int t = 7;
        int a[] = { -1, -1 };
        if (arr.length == 1 && a[0] == t) {
            a[0] = 0;
            a[1] = 1;
        }
        int f = 0;
        int l = arr.length - 1;
        while (f < l) {
            if (arr[f] == t) {
                a[0] = f;
            }
            if (arr[l] == t) {
                a[1] = l;
            }
            if (a[0] == -1) {
                f++;
            }
            if (a[1] == -1) {
                l--;

            }
            if (a[0] != -1 && a[1] != -1) {
                break;
            }

        }
        System.out.println(a[0] + " " + a[1]);
    }
}
