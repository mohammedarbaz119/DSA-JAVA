import java.util.*;

public class COmbinationSUm {
    static List<List<Integer>> a = new ArrayList<>();

    static List<List<Integer>> combsm(int arr[], int n, int sum, int t, List<Integer> d) {
        if (sum == t) {
            if (!a.contains(d)) {
                a.add(d);
            }
            return a;
        }
        if (sum > t) {
            return null;
        }
        for (int i = n; i < arr.length; i++) {
            List<Integer> New = new ArrayList<>(d);
            New.add(arr[i]);
            combsm(arr, n, sum + arr[i], t, New);
            n++;
        }

        return a;

    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 5 };
        System.out.println(combsm(arr, 0, 0, 8, new ArrayList<>()));

    }
}
