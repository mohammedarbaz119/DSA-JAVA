public class productexceptself {
    public static int prodduct(int[] arr, int i) {
        int ele = 1;
        for (int j = 0; j < arr.length; j++) {
            if (j == i) {
                continue;
            }
            ele *= arr[j];

        }
        return ele;
    }

    public static void main(String[] args) {
        int[] arr = { -1, 1, 0, -3, 3 };
        int[] newarr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newarr[i] = prodduct(arr, i);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(newarr[i]);
        }
    }
}
