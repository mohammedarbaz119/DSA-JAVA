import java.util.HashMap;

public class LARGESTNUm {
    public static void main(String[] args) {
        int arr[] = { -1, 10, 6, 8, -7 };
        int min = Integer.MIN_VALUE;
        HashMap<Integer, Integer> a = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            a.put(arr[i], i);

        }
        for (int i = 0; i < arr.length; i++) {
            if (a.containsKey(arr[i] * -1)) {
                min = Math.max(min, Math.abs(arr[i]));
            }
        }
        System.out.println(min == Integer.MIN_VALUE ? -1 : min);

    }
}
