public class CountNegatives {
    public static void main(String[] args) {

        int arr[][] = { { 4, 2, -1, -3 }, { -1, -2, -3, -4 }, { 3, 2, -4, -3 } };
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            int l = 0;
            int h = arr[i].length - 1;
            while (l <= h) {
                int mid = l + (h - l) / 2;
                if (arr[i][mid] < 0) {
                    h = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
            c += arr[i].length - l;
        }
        System.out.println(c);
    }
}
