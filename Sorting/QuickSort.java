import java.util.Arrays;

public class QuickSort {
    static void swap(int arr[], int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    static int part(int arr[], int low, int high) {
      
        int p = arr[low];
       int i = low;
       int j = high;
       while(i<j){
        while(arr[i]<=p&&i<j){
            i++;
        }
        while(arr[j]>p){
            j--;
        }
        System.out.println(i + " i is left and j is right " + j);
        if(i<j){
            swap(arr, i, j);
        }
        // if(arr[i]>p&&arr[j]<p){
        //     swap(arr, i, j);
        //     i++;
        //     j--;
        // }
       }
       
       swap(arr,low, j);
       return j;
    }

    static void sort(int arr[], int low, int high) {
        if (low < high) {

            // pi is partitioning index, arr[p]
            // is now at right place
            int pi = part(arr, low, high);

            // Separately sort elements before
            // partition and after partition
            sort(arr, low, pi - 1);
            sort(arr, pi+1, high);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 80,10, 56, 554, 242, 245 };
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
