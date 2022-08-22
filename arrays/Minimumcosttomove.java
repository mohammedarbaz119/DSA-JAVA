public class Minimumcosttomove {
    public static void main(String[] args) {
        int[] arr = { 2, 2, 2, 3, 3 };
        int even = 0;
        int odd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even++;

            } else {
                odd++;
            }
        }
        if (even == arr.length || odd == arr.length) {
            System.out.println(0);
        } else {
            System.err.println(Math.min(even, odd));
        }
    }
}
