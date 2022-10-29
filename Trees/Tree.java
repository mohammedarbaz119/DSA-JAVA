import java.lang.module.ModuleDescriptor.Builder;
import java.util.Scanner;

public class Tree {
    int val;
    Tree left;
    Tree right;
    public Tree(int val){
        this.val=val;
        this.left=null;
        this.right=null;
    }
    boolean isValidBST(Tree root){
        if(root.val< root.left.val||root.val>root.right.val){
return false;
        }
        return isValidBST(root.left)&&isValidBST(root.right);
    }
    void traverse(Tree root){
        if(root==null){
            return;
        }
        System.out.println(root.val);
        traverse(root.left);
        
        traverse(root.right);
    }

public static void main(String[] args) {
    Tree root = new Tree(1);
   root.left= new Tree(0);
   root.right = new Tree(3);
   root.left.left= new Tree(5);
   root.traverse(root);
   System.out.println(root.isValidBST(root));
}
}
