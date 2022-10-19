public class Sortcolours {
    public static void swap(int arr[], int a, int b) {
        int t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 0, 2, 1, 1, 0 };
        int l = 0;
        int h = arr.length - 1;
        while (l <= arr.length - 1 && h >= 0) {
            if (l < h) {
                if (arr[l] > arr[h]) {
                    swap(arr, l, h);

                }
                l++;
            } else if (l > h) {
                if (arr[h] > arr[l]) {
                    swap(arr, h, l);

                }
                l++;
                h--;
            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
