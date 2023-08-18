import java.lang.reflect.Array;
import java.util.Arrays;

public class grapgcoloring {
    static int[][] arr = {
        {0, 1, 1, 1},
        {1, 0, 1, 0},
        {1, 1, 0, 1},
        {1, 0, 1, 0}

    };
    static int sol = 0;
    static int[] c = new int[4];
    static int n = 4;

    static void slve() {
        Arrays.fill(c, -1);
        call(0);
        if (sol <= 0) {
            System.out.println("no sol");
            return;
        }
        System.out.println(sol);
    }

    static void call(int pos) {
        if (pos >= n) {
            System.out.println(Arrays.toString(c));
            sol++;
            return;
        }
        for (int i = 1; i < n; i++) {
            if (issafe(pos,i)==true) {
                c[pos] = i;
                call(pos + 1);
                c[pos] = -1;
            }
        }
    }
    static boolean issafe(int pos, int col) {
        for (int i = 0; i < n; i++) {
            if (arr[pos][i] == 1 && col == c[i]) {
                return false;
            }
        }
        return true;
    }
    
    // static boolean issafe(int pos,int col){
    //     for (int i = 0; i < n; i++) {
    //         if(arr[pos][i]==1&&col == c[i]){
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    public static void main(String[] args) {
        slve();
    }
}
