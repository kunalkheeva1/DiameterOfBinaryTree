import com.sun.source.tree.Tree;

class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int data, TreeNode left, TreeNode right){
        this.data =data;
        this.left = left;
        this.right =right;
    }
}


public class DiameterOfBinaryTree {
    static int ans =0;
    static int rec(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = rec(root.left);
        int right = rec(root.right);
        ans = Math.max(ans, left + right +1);
        return Math.max(left,right)+1;
    }


    public static int diameterOfBinaryTree(TreeNode root){
        if(root == null){
            return 0;
        }
        ans=0;
        rec(root);
        return ans;

    }

    public static void main(String[] args) {

    }
}
