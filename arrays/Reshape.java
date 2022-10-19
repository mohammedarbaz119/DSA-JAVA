public class Reshape {
    public static void main(String[] args) {
        int arr[][] = { { 1, 2 }, { 3, 4 } };
        int r = 1, c = 4;
        if ((arr.length * arr[0].length) != r * c) {
            System.out.println(arr);
        }
        int ouarr[][] = new int[r][c];
        int r1 = 0, c1 = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                ouarr[r1][c1] = arr[i][j];
                c1++;
                if (c1 == c) {
                    r1++;
                    c1 = 0;
                }
            }

        }

    }
}
