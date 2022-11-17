public class MissingNum {
    public static void main(String[] args) {
        int arr[] = { 9, 6, 4, 2, 3, 5, 7, 8, 1 };
        int sum = arr.length * (arr.length + 1) / 2;
        int arrsum = 0;
        for (int i = 0; i < arr.length; i++) {
            arrsum += arr[i];
        }
        System.out.println(sum - arrsum);
    }
}
