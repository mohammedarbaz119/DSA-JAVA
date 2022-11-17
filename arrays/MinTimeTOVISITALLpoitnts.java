public class MinTimeTOVISITALLpoitnts {
    public static void main(String[] args) {
        int arr[][] = { { 1, 1 }, { 3, 4 }, { -1, 0 } };
        int c = 0;
        for (int i = 0; i < arr.length - 1; i++) {

            c += Math.max(Math.abs(arr[i][0] - arr[i + 1][0]), Math.abs(arr[i][1] - arr[i + 1][1]));
        }
        System.out.println(c);
    }
}
