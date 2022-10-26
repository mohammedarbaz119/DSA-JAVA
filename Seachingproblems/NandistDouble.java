public class NandistDouble {
    static void swap(int arr[], int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    static void sort(int arr[], int n) {
        boolean b = false;

        if (n == 1) {
            return;
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] > arr[i + 1]) {
                swap(arr, i, i + 1);
                b = true;
            }
        }

        if (!b) {
            return;
        }
        sort(arr, n - 1);
    }

    static boolean search(int arr[], int i, int j, int t) {
        while (i <= j) {
            int mid = (i + j) / 2;
            if (arr[mid] == t) {
                return true;
            } else if (arr[mid] > t) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { -2, 0, 10, -19, 4, 6, -8 };
        sort(arr, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                if (search(arr, i, arr.length - 1, arr[i] * 2)) {
                    System.out.println(true);
                    break;
                } else {
                    if (search(arr, 0, i, arr[i] * 2)) {
                        System.out.println(true);
                        break;
                    }
                }
            }

        }
    }
}
