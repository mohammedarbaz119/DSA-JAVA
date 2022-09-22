import java.lang.reflect.Array;
import java.util.ArrayList;

public class Spiralmatrix {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
        int top = 0;
        int bottom = arr.length - 1;
        ArrayList<Integer> a = new ArrayList<>();
        int left = 0;
        int right = arr[0].length - 1;
        int count = 0;
        while (top <= bottom && left <= right) {
            switch (count) {
                case 0:
                    for (int i = left; i <= right; i++) {
                        a.add(arr[top][i]);
                    }
                    top++;
                    break;
                case 1:
                    for (int i = top; i <= bottom; i++) {
                        a.add(arr[i][right]);

                    }

                    right--;
                    break;
                case 2:
                    for (int i = right; i >= left; i--) {
                        a.add(arr[bottom][i]);
                    }
                    bottom--;
                    break;
                case 3:
                    for (int i = bottom; i >= top; i--) {
                        a.add(arr[i][left]);
                    }
                    left++;
                    break;
                default:
                    System.out.println("invalid");
            }

            count = (count + 1) % 4;
        }
        System.out.println(a);
    }
}
