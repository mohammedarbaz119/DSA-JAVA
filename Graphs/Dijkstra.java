import java.util.*;
import java.util.AbstractSet;

class Pair {
    int p;
    int cost;

    Pair(int p, int c) {
        this.p = p;
        this.cost = c;
    }

}

class PairComp implements Comparator<Pair> {
    public int compare(Pair a, Pair b) {
        return Integer.compare(a.cost, b.cost);
    }

}

public class Dijkstra {
    static HashMap<Integer, Integer> parentMap = new HashMap<>();
    static int[] distance;
    static int cost = 0;

    static void cos(HashMap<Integer, ArrayList<Pair>> a, int s,int v) {
        distance = new int[v+1];
        Arrays.fill(distance,Integer.MAX_VALUE);
        PriorityQueue<Pair> p = new PriorityQueue<>(new PairComp());
        HashSet<Integer> sse = new HashSet<>();
        p.add(new Pair(s, 0));
        sse.add(s);
        parentMap.put(s, -1);
        distance[0] = 0;

        while (!p.isEmpty()) {
            Pair paa = p.poll();
            for (Pair pa : a.get(paa.p)) {
                if (!sse.contains(pa.p)) {
                    if (distance[pa.p] > pa.cost + distance[paa.p]) {
                        distance[pa.p] = pa.cost + distance[paa.p];
                        parentMap.put(pa.p, paa.p);
                        p.add(pa);
                    }
                }

            }

        }

    }

    static void addEdge(HashMap<Integer, ArrayList<Pair>> graphMap, int u, int v, int weight) {
        graphMap.putIfAbsent(u, new ArrayList<>());
        graphMap.putIfAbsent(v, new ArrayList<>());

        graphMap.get(u).add(new Pair(v, weight));
        graphMap.get(v).add(new Pair(u, weight));
    }

    public static void main(String[] args) {
        HashMap<Integer, ArrayList<Pair>> a = new HashMap<>();
        a.put(0, new ArrayList<>(Arrays.asList(new Pair(1, 5), new Pair(2, 1))));
        a.put(1, new ArrayList<>(Arrays.asList(new Pair(4, 5), new Pair(6, 7))));
        a.put(4, new ArrayList<>(Arrays.asList(new Pair(6, 5))));
        a.put(6, new ArrayList<>());
        a.put(2, new ArrayList<>(Arrays.asList(new Pair(1, 3))));
        cos(a, 0, 6);
        for (Integer vertex : a.keySet()) {
            System.out.println("cost from 0 to " + vertex + " is " + distance[vertex]);
        }
        System.out.println(parentMap);

    }
}
