import java.util.*;

class Pair {
    int p;
    int f;
    int cost;

    public Pair(int f, int se) {
        this.f = f;
        this.cost = se;
    }

    @Override
    public String toString() {
        return "Pair [f=" + f + ", cost=" + cost + " " + p + "]";
    }

}

class PairComp implements Comparator<Pair> {
    @Override
    public int compare(Pair a, Pair b) {
        return Integer.compare(a.cost, b.cost);
    }
}

public class Prim {
    static int cost = 0;
    static HashMap<Integer, Integer> pareMap = new HashMap<>();

    static int primsolver(HashMap<Integer, ArrayList<Pair>> a, int s, HashSet<Integer> set) {
        PriorityQueue<Pair> p = new PriorityQueue<>(new PairComp());
        set.add(s);
        pareMap.put(s, -1);
        for (Pair pair : a.get(s)) {
            pareMap.put(pair.f, s);
            pair.p = s;
            p.add(pair);
        }
        while (!p.isEmpty()) {
            Pair pa = p.poll();

            if (!set.contains(pa.f)) {
                cost += pa.cost;
                pareMap.put(pa.f, pa.p);
                set.add(pa.f);

            for (Pair pair : a.get(pa.f)) {
                if (!set.contains(pair.f)) {
                    pair.p = pa.f;
                    p.add(pair);
                }

            }
            }
        }
        return cost;
    }

    // public class Prim {
    // static int n;

    // static int cost = 0;
    // static int[] parents= new int[30];
    // static HashMap<Integer, Integer> parentMap = new HashMap<>();

    // static int primsolver(HashMap<Integer, ArrayList<Pair>> a, int s,
    // Set<Integer> set) {
    // Queue<Pair> c = new PriorityQueue<>(new PairComp());
    // for (Pair pair : a.get(s)) {
    // pair.p = s;
    // c.add(pair);
    // }
    // set.add(s);
    // parentMap.put(s, -1);

    // while (!c.isEmpty()) {
    // Pair pa = c.poll();

    // if (!set.contains(pa.f)) {
    // set.add(pa.f);
    // parentMap.put(pa.f, pa.p);

    // cost += pa.cost;

    // for (Pair pair : a.get(pa.f)) {
    // if (!set.contains(pair.f)) {
    // pair.p = pa.f;
    // c.add(pair);
    // }
    // }
    // }
    // }

    // return cost;
    // }
    static void addEdge(HashMap<Integer, ArrayList<Pair>> graphMap, int u, int v, int weight) {
        graphMap.putIfAbsent(u, new ArrayList<>());
        graphMap.putIfAbsent(v, new ArrayList<>());

        graphMap.get(u).add(new Pair(v, weight));
        graphMap.get(v).add(new Pair(u, weight));
    }

    public static void main(String[] args) {
        HashMap<Integer, ArrayList<Pair>> a = new HashMap<>();
        addEdge(a, 0, 1, 4);
        addEdge(a, 0, 7, 8);
        addEdge(a, 1, 2, 8);
        addEdge(a, 1, 7, 11);
        addEdge(a, 2, 3, 7);
        addEdge(a, 2, 8, 2);
        addEdge(a, 2, 5, 4);
        addEdge(a, 3, 4, 9);
        addEdge(a, 3, 5, 14);
        addEdge(a, 4, 5, 10);
        addEdge(a, 5, 6, 2);
        addEdge(a, 6, 7, 1);
        addEdge(a, 6, 8, 6);
        addEdge(a, 7, 8, 7);

        int aa = primsolver(a, 0, new HashSet<>());
        System.out.println("mincost of mst is " + aa);
        System.out.println(pareMap);

    }
}
