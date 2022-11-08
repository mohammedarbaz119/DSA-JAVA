public class RangeSumOfBST {
    // https://leetcode.com/problems/range-sum-of-bst/submissions/
    static int sumof(TreeNode root, int low, int high, int sum) {
        if (root == null) {
            return 0;
        }

        if (root.val >= low && root.val <= high) {
            sum += root.val;
        }
        sum += sumof(root.left, low, high, 0);
        sum += sumof(root.right, low, high, 0);
        return sum;
    }

    public int rangeSumBST(TreeNode root, int low, int high) {
        int sum = sumof(root, low, high, 0);
        return sum;
    }
}
