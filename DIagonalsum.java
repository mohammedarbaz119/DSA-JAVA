public class DIagonalsum {
    public static void main(String[] args) {
        int arr[][] = { { 7, 3, 1, 9 }, { 3, 4, 6, 9 }, { 6, 9, 6, 6 }, { 9, 5, 8, 5 } };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {

            int j = (arr[i].length - 1) - i;
            System.out.println(i + " " + j);
            sum += arr[i][i];
            if (i != j) {
                sum += arr[i][j];
            }
        }
        System.out.println(sum);
    }
}
