public class Jumpgame {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 1, 0, 4 };
        boolean b = true;
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i > j) {
                System.out.println(false);
                break;
            }
            if ((i + arr[i]) > j) {
                j = arr[i] + i;
            }
            System.out.println(j);

        }
        System.out.println(true);

    }
}
