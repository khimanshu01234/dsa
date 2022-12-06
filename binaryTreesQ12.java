public class binaryTreesQ12 {
    static class Node{
        int data;
        Node left,right;
        Node(int d){
            data=d;
            left=null;
            right=null;
        }
    }
    public static void toSumTree(Node root){
        helper(root);
        root.data += (root.left.data + root.right.data);
    }
    public static int helper(Node root){
        if(root == null) return 0;
        int temp = root.data;
        root.data = helper(root.left) + helper(root.right);
        return temp+root.data;
    }
}
