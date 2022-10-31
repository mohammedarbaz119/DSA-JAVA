import java.util.ArrayList;

public class COmbinationSUm {
    static ArrayList<ArrayList<Integer>> combsm(int arr[],int n,ArrayList<ArrayList<Integer>> a,int sum,int t,ArrayList<Integer> d){
        if(n==arr.length){
            return a;
        }
        d.add(arr[n]);  
      sum+=arr[n];
        if(sum==t){
            a.add(d);
            System.out.println(a);
            sum =0;
        }
        System.out.println(sum);
        return combsm(arr, n+1, a, sum, t, d);



    }
    public static void main(String[] args) {
        int arr[] ={2,2,3,7};
        System.out.println(combsm(arr, 0,new ArrayList<>(), 0, 7,new ArrayList<>()));

    }
}
