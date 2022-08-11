public class MAXsubarrray {
    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int s = 0;
        int m = 0;
        for (int i = 0; i < arr.length; i++) {
            s += arr[i];
            System.out.println(s);
            if (s < 0) {
                s = 0;
            }
            if (m < s) {
                m = s;
            }
        }
        System.out.println(m);
    }
}
