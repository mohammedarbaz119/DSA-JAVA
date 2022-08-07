public class transpose {
    public static void main(String[] args) {
        int[][] m = { { 1, 2, 3 }, { 4, 5, 6 } };
        int[][] t = new int[m[0].length][m.length];
        for (int i = 0; i < m[0].length; i++) {
            for (int j = 0; j < m.length; j++) {
                t[i][j] = m[j][i];
            }
        }
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[0].length; j++) {
                System.out.println(t[i][j]);
            }
        }
    }
}
