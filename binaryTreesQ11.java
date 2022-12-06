public class binaryTreesQ11 {
    class Node {
        int data;
        Node left,right;
        Node(int d) {
            data = d;
            left = right = null;
        }
    }
    boolean ans = true;
    boolean isBalanced(Node root) {
        helper(root);
        return ans;
    }
    int helper(Node root){
        if(root == null) return -1;
        int maxLeft = helper(root.left);
        int maxRight = helper(root.right);
        if(Math.abs(maxLeft - maxRight) > 1) ans = false;
        return Math.max(maxLeft,maxRight)+1;
    }
}
