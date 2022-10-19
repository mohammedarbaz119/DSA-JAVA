public class SlidingWindow {
    public static void main(String[] args) {
        int arr[] = { 1, 4, 2, 10, 2, 3, 1, 0, 20 };
        int k = 4;
        int mac = Integer.MIN_VALUE;
        int curs = 0;
        for (int i = 0; i < k; i++) {
            curs += arr[i];
        }
        mac = Math.max(mac, curs);
        // for (int i = 1; i <= arr.length - k; i++) {
        // int cursu = 0;
        // for (int j = 0; j < k; j++) {
        // cursu += arr[j + i];
        // }
        // mac = Math.max(mac, cursu);
        // }
        int j = 0, f = k;
        while (k <= arr.length - 1) {
            curs -= arr[j];
            curs += arr[k];
            mac = Math.max(mac, curs);
            j++;
            k++;

        }
        System.out.println(mac);
    }
}
