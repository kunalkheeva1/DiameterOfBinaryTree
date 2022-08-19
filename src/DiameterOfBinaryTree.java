
//TreeNode class
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
    //static int to use it everywhere
    static int ans =0;
    static int rec(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = rec(root.left);
        int right = rec(root.right);
        ans = Math.max(ans, left + right + 1);  //doing +1 here to include the root node as well
        //idk why but if i only need to return ans at the end why do i need to return this statement
        return Math.max(left, right) + 1;

    }


    public static int diameterOfBinaryTree(TreeNode root){
        if(root == null){
            return 0;
        }
        ans=0;
        rec(root);
        return ans - 1;   // doing -1 here as I just needed the number of edges

    }

    public static void main(String[] args) {

    }
}
