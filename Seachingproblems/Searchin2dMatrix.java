public class Searchin2dMatrix {
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int r = 0, c = arr[0].length - 1;
        int t = 7;
        while (r < arr.length && c >= 0) {
            if (arr[r][c] == t) {
                System.out.println(r + " " + c);
                break;
            } else if (arr[r][c] < t) {
                r++;
            } else {
                c--;
            }
        }

    }
}
