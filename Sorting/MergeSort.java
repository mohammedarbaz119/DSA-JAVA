import java.util.Arrays;

public class MergeSort {
    static void megre(int a[], int lo, int mid, int high) {
        int ll = (mid-lo)+1;
        int rr= high-mid;
        int[] l = new int[ll];
        int[] r=  new int[rr];
        int k = lo;
        int i= 0,j=0;  
           for (int j2 = 0; j2 < rr; j2++) {
            r[j2] = a[j2+mid+1];
          }  
           for (int j2 = 0; j2 < ll; j2++) {
            l[j2] = a[lo+j2];
          }      
           
        while (i < ll && j < rr) {
            if (l[i] > r[j]) {
                a[k] = r[j];
                j++;
                 k++;
            } else {
                a[k] = l[i];
                i++;
                 k++;
            }
        }
       
            while (i < ll) {
                a[k] = l[i];
                i++;
                 k++;
            }
        
        
            while (j < rr) {
                a[k] = r[j];
                j++;
                 k++;
            }
        
       
     

    }

    static void sort(int[] arr, int l, int h) {
        if (l < h) {
            int mid = (l + h) / 2;
            sort(arr, l, mid);
            sort(arr, mid + 1, h);
            megre(arr, l, mid, h);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 35, 34, 23, 5, 4 };
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
