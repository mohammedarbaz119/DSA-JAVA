import java.util.*;


public class HashMapexaple {
    static HashMap<Integer, ArrayList<Integer>> buildGraph(int arr[][]) {
        HashMap<Integer, ArrayList<Integer>> a = new HashMap<>();
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

    static void DFS(HashMap<Integer, ArrayList<Integer>> a, Set<Integer> b, int s) {
        Queue<Integer> st = new ArrayDeque<>();
        st.add(s);

        while (!st.isEmpty()) {
            int i = st.poll();
            b.add(i);
            System.out.println(i);
            for (Integer integer2 : a.get(i)) {
                if (!b.contains(integer2) && !st.contains(integer2)) {
                    st.add(integer2);
                }
            }

        }

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
        HashMap<Integer, ArrayList<Integer>> a = new HashMap<>();
        a.put(1, new ArrayList<Integer>(Arrays.asList(new Integer[] { 2, 3 })));
        a.put(2, new ArrayList<Integer>(Arrays.asList(new Integer[] { 3, 5 })));
        a.put(3, new ArrayList<Integer>(Arrays.asList(new Integer[] { 4 })));
        a.put(4, new ArrayList<>());
        a.put(5, new ArrayList<>());
        DFS(a, d, 1);

    }
}