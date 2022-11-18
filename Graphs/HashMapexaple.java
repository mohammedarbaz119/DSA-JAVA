import java.net.Inet4Address;
import java.util.*;

import javax.swing.DefaultDesktopManager;

public class HashMapexaple {
    static HashMap<Integer, ArrayList<Integer>> buildGraph(int arr[][]) {
        HashMap<Integer, ArrayList<Integer>> a = new HashMap();
        for (int i = 0; i < arr.length; i++) {
            if (!a.containsKey(arr[i][0]))
                a.put(arr[i][0], new ArrayList<>());
            if (!a.containsKey(arr[i][1]))
                a.put(arr[i][1], new ArrayList<>());
            a.get(arr[i][0]).add(arr[i][1]);
        }
        return a;
    }

    static int DFS(HashMap<Integer, ArrayList<Integer>> a) {
        for (Integer integer : a.keySet()) {
            if (checkjudge(a, integer)) {
                return integer;
            }
        }
        return -1;

    }

    static boolean checkjudge(HashMap<Integer, ArrayList<Integer>> a, int key) {
        if (a.get(key).size() > 0) {
            return false;
        }
        for (Integer i : a.keySet()) {
            if (i == key) {
                continue;
            }
            if (!a.get(i).contains(key)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2 } };
        Set<Integer> d = new HashSet<>();
        HashMap<Integer, ArrayList<Integer>> a = buildGraph(arr);
        System.out.println(DFS(a));
    }
}