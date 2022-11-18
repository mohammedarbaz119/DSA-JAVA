public class increaBST {
    static void traverse(Tree root) {
        if (root == null) {
            return;
        }
        System.out.println(root.val);
        traverse(root.right);
    }

    public static void main(String[] args) {
        Tree root = new Tree(3);
        root.left = new Tree(2);
        root.right = new Tree(4);
        root.left.right = new Tree(3);
        root.left.left = new Tree(1);
        root.right.left = new Tree(3);
        root.right.right = new Tree(6);
        place(root);
        traverse(root);
    }
}
