import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Setmatrixzeros {
    public static void name(int[][] arr, int i, int j) {
        for (int j2 = 0; j2 < arr[i].length; j2++) {
            arr[i][j2] = 0;
        }
        for (int j2 = 0; j2 < arr.length; j2++) {
            arr[j2][j] = 0;
        }
    }

    public static void main(String[] args) {
        int[][] arr = { { 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 1, 3, 1, 5 } };
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0) {
                    a.add(i);
                    b.add(j);
                }

            }
        }
        for (

                int i = 0; i < a.size(); i++) {
            name(arr, a.get(i), b.get(i));
        }
        System.out.println(a);
        System.out.println(b);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }
}
