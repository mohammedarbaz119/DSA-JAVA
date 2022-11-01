import java.util.*;

public class COmbinationSUm {
    

    static List<List<Integer>> combsm(int arr[],int n,List<List<Integer>> a,int sum,int t,List<Integer> d){
        if(n==arr.length){
            return a;
        }
        d.add(arr[n]);  
      sum+=arr[n];
        if(sum==t){
            ArrayList<Integer> e = new ArrayList<>(d);
            a.add(e);
            d.clear();
            sum =0;
        }
        return combsm(arr, n+1, a, sum, t, d);



    }
    public static void main(String[] args) {
        int arr[] ={2,2,3,7};
        System.out.println(combsm(arr, 0, new ArrayList<>(), 0, 7, new ArrayList<>()));

    }
}
