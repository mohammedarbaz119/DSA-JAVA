import java.util.*;
public class Qick {
    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    static int part(int[] arr, int l, int h) {
        int p = arr[l];
        int i = l;
        int j = h;
        while (i < j) {
            while (arr[i] >= p && i < j) {
                i++;
            }
            while (arr[j] < p) {
                        j--;

            }
            if (i < j) {
            swap(arr, i, j);
        }
        }
        
        swap(arr, l, j);
        return j;
    }
    static void sort(int[] arr,int low,int high){
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
        int arr[] = { 2, 35, 34, 23, 5, 4 };
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
