import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

class Pair {
    int p;
    int f;
    int cost;

    public Pair(int p, int f, int se) {
        this.f = f;
        this.p = p;
        this.cost = se;
    }

    @Override
    public String toString() {
        return "Pair [f=" + f + ", cost=" + cost + " " + p + "]";
    }

}

public class Kruskal {
    static int parent[] = new int[10];

    static int KruskalSolver(int n) {
        for(int i=0;i<n;i++){
            parent[i] = i;
        }
        int cost = 0;
        int i = 0;
        while (i < n && !a.isEmpty()) {
            Pair b = a.poll();
            if (find(b.f) != find(b.p)) {
                cost += b.cost;
                union(b.f, b.p);
                i++;
            }

        }

        return cost;
    }

    static int find(int x) {
        if (parent[x] != x) {
            return find(parent[x]);

        }
        return parent[x];
    }

    static void union(int i, int j) {
        parent[find(i)] = find(j);
    }

    static PriorityQueue<Pair> a = new PriorityQueue<>(new PairComp());

    static void addEdge(int u, int v, int weight) {
        a.add(new Pair(v, u, weight));
    }

    public static void main(String[] args) {
        HashMap<Integer, ArrayList<Pair>> a = new HashMap<>();
        addEdge(0, 1, 4);
        addEdge(0, 7, 8);
        addEdge(1, 2, 8);
        addEdge(1, 7, 11);
        addEdge(2, 3, 7);
        addEdge(2, 8, 2);
        addEdge(2, 5, 4);
        addEdge(3, 4, 9);
        addEdge(3, 5, 14);
        addEdge(4, 5, 10);
        addEdge(5, 6, 2);
        addEdge(6, 7, 1);
        addEdge(6, 8, 6);
        addEdge(7, 8, 7);
        int aa = KruskalSolver(9);
        System.out.println(Arrays.toString(parent));
        System.out.println("mincost of mst is " + aa);

    }

}
