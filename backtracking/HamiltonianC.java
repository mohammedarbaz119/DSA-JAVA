import java.util.Arrays;

public class HamiltonianC {
    static int sol = 0;
    static int[] path = new int[5];
    {
        Arrays.fill(path, -1);
        path[0] = 0;

    }

    static boolean issafe(int[][] g, int v, int pos) {
        for (int i = 1; i < pos; i++) {
            if (path[i] == v) {
                return false;
            }
        }

        if (g[path[pos - 1]][v] == 0) {
            return false;
        }

        return true;
    }

    static void hamil(int[][] g, int row) {

        if (row >= 5) {
            if (g[path[row - 1]][path[0]] == 1) {
                sol++;
                for (int i = 0; i < path.length; i++) {
                    System.out.print(path[i] + " ");
                }
                System.out.print(path[0]);
                System.out.println();
            }
            ;
        }
        for (int i = 1; i < 5; i++) {
            if (issafe(g, i, row)) {
                path[row] = i;
                hamil(g, row + 1);
                path[row] = -1;
            }
        }

    }

    static void hamilcall(int[][] g, int row) {
        hamil(g, row);
        if (sol <= 0) {
            System.out.println("no solution");
        }
    }

    public static void main(String[] args) {
        int[][] graph = {
                { 0, 1, 1, 0, 1 },
                { 1, 0, 1, 1, 0 },
                { 1, 1, 0, 1, 1 },
                { 0, 1, 1, 0, 1 },
                { 1, 0, 1, 1, 0 }
        };
        hamil(graph, 1);
    }

}
