public class Firstposiitve {
    public static void main(String[] args) {
        int arr[] = { 3, 4, -1, 1 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = 0;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            int a = Math.abs(arr[i]);
            if (1 <= a && a <= arr.length) {
                if (arr[a - 1] > 0) {
                    arr[a - 1] = -1;
                } else if (arr[a - 1] == 0) {
                    arr[a - 1] = -1 * (arr.length + 1);
                }
            }
        }

        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] >= 0) {
                System.out.println(i);
                break;
            }
        }
        System.out.println(arr.length + 1);

    }
}
