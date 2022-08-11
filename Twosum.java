public class Twosum {
    public static void main(String[] args) {
        HashMap<Integer, Integer> v = new HashMap<>();
        int i;
        int[] a = new int[2];
        for (i = 0; i < nums.length; i++) {
            int s = t - nums[i];
            if (v.containsKey(s)) {
                a[0] = i;
                a[1] = v.get(s);
            }

            v.put(nums[i], i);
        }

        System.out.println(a.toString());
    }
}
