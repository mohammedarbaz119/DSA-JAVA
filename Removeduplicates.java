import java.util.HashSet;

public class Removeduplicates {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 3, 4, 4, 4, 3, 5 };
        HashSet<Integer> a = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            a.add(arr[i]);

        }
        System.out.println(a.size());
    }
}
