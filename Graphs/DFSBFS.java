import java.util.*;
import java.util.HashSet;
import java.util.AbstractSet;

public class DFSBFS {
    static void DFS(HashMap<Integer,ArrayList<Integer>> a,int start){
        HashSet<Integer> b =new HashSet<>();
        Stack<Integer> st = new Stack<>();
        st.add(start);
        b.add(start);
        while(!st.isEmpty()){
            int node = st.pop();
            System.out.println(node);
         
            for (Integer integer : a.get(node)) {
                if(!b.contains(integer)){
                    st.add(integer);
                     b.add(integer);
                }
            }
        }
    }

 static void BFS(HashMap<Integer,ArrayList<Integer>> a,int start){
        HashSet<Integer> b =new HashSet<>();
        Queue<Integer> st = new ArrayDeque<>();
        st.add(start);
        b.add(start);
        while(!st.isEmpty()){
            int node = st.poll();
            System.out.println(node);
         
            for (Integer integer : a.get(node)) {
                if(!b.contains(integer)){
                    st.add(integer);
                     b.add(integer);
                }
            }
        }
    }


    static void addEdge(HashMap<Integer,ArrayList<Integer>> a,int u,int v){
        a.putIfAbsent(u, new ArrayList<>());
        a.putIfAbsent(v, new ArrayList<>());
        a.get(u).add(v);
        a.get(v).add(u);
    }
    public static void main(String[] args) {
        HashMap<Integer,ArrayList<Integer>> a = new HashMap<>();
        addEdge(a, 0, 1);
        addEdge(a, 0, 7);
        addEdge(a, 1, 2);
        addEdge(a, 1, 7);
        addEdge(a, 2, 3);
        addEdge(a, 2, 8);
        addEdge(a, 2, 5);
        addEdge(a, 3, 4);
        addEdge(a, 3, 5);
        addEdge(a, 4, 5);
        addEdge(a, 5, 6);
        addEdge(a, 6, 7);
        addEdge(a, 6, 8);
        System.out.println(a);
        BFS(a, 0);
    }
}
