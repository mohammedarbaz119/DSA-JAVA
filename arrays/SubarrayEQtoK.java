public class SubarrayEQtoK {
    public static void main(String[] args) {
        int arr[] = { 1, 1, 1 };
        int sum = 0, j = 0, i = 0, c = 0;
        int t = 2;
        while (i < arr.length && j < arr.length) {

            if (sum < t) {
                sum += arr[i];
                i++;
            } else if (sum > t) {
                sum -= arr[j];
                j++;
            } else {
                c++;
                i++;
            }
        }
        System.out.println(c);
    }
}
