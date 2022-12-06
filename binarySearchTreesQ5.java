public class binarySearchTreesQ5 {
    class Node {
        int data;
        Node left, right;
        Node(int item) {
            data = item;
            left = right = null;
        }
    }
    static boolean ans;
    public static boolean isDeadEnd(Node root) {
        ans = false;
        traversal(root, Integer.MAX_VALUE, 0);
        return ans;
    }
    public static void traversal(Node root, int max, int min){
        if(root == null) return;
        if(root.left == null && root.right == null)
            if(root.data+1 >= max || root.data-1 <= min) ans = true;
        traversal(root.left, root.data, min);
        traversal(root.right, max, root.data);
    }
}
