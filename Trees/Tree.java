import java.lang.module.ModuleDescriptor.Builder;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Tree {
    int val;
    Tree left;
    Tree right;

    public Tree(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }

    static void traverse(Tree root) {
        if (root == null) {
            return;
        }
        System.out.println(root.val);
        traverse(root.left);

        traverse(root.right);
    }

    static void levelorder(Tree root) {
        Queue<Tree> a = new LinkedList<>();
        ArrayList<ArrayList<Integer>> b = new ArrayList<>();
        a.add(root);
        while (a.size() > 0) {

            Tree c = a.poll();

            if (c.left != null)
                a.add(c.left);
            if (c.right != null)
                a.add(c.right);
        }
    }

    public static void main(String[] args) {
        Tree root = new Tree(1);
        root.left = new Tree(0);
        root.right = new Tree(3);
        root.left.right = new Tree(6);
        root.left.left = new Tree(5);
        root.right.left = new Tree(2);
        root.right.right = new Tree(7);
        levelorder(root);

    }
}
