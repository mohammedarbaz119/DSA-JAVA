

public class Searchpos {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 6 };
        int t = 1;
        int i = 0, j = arr.length - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (arr[mid] == t) {
                System.out.println(mid);
                break;
            } else if (arr[mid] > t) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }

        }
        System.out.println(-1);

    }
}