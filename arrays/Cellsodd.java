public class Cellsodd {
    public static void incrrow(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 1;
        }

    }

    public static void incrcol(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i][0] += 1;
        }
    }

    public static void main(String[] args) {
        int arr[][] = { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } };
        for (int i = 0; i < arr.length; i++) {
            incrrow(arr[i]);
            incrcol(arr);
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }
}