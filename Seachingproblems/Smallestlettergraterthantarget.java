public class Smallestlettergraterthantarget {
    public static void main(String[] args) {
        char arr[] = { 'c', 'f', 'j' };
        char t = 'c';
        int l = 0, h = arr.length - 1;
        char ans = arr[0];
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (arr[mid] == t) {
                l = mid + 1;

            } else if (arr[mid] < t) {
                l = mid + 1;
            } else {
                ans = arr[mid];
                h = mid - 1;
            }
        }
        System.out.println(ans);
    }
}
