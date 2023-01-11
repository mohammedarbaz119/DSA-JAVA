import java.util.*;

public class Solution {
    static List<List<Integer>> re = new ArrayList<>();

    static void findpaths(int[][] gr, int i, ArrayList<Integer> a) {
        if (i == gr.length - 1) {
            if (a.contains(gr.length - 1)) {
                re.add(a);
                return;
            }
        }

        if (!a.contains(i)) {
            a.add(i);
        }

        for (int j = 0; j < gr[i].length; j++) {
            ArrayList<Integer> b = new ArrayList<>(a);
            b.add(gr[i][j]);
            findpaths(gr, gr[i][j], b);
        }

    }

    static List<List<Integer>> allPathsSourceTarget(int[][] gr) {
        findpaths(gr, 0, new ArrayList<>());
        System.out.print(gr.length - 1);
        return re;
    }

    public static void main(String[] args) {
        int arr[][] = { { 4, 3, 1 }, { 3, 2, 4 }, { 3 }, { 4 }, {} };
        System.out.println(allPathsSourceTarget(arr));
    }
}
