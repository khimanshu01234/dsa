public class binaryTreesQ10 {
    static class Node {
        int data;
        Node left, right;
        Node(int item) {
            data = item;
            left = right = null;
        }
    }
    static int lvl = -1;
    static boolean ans = true;
    static boolean check(Node root) {
        traversal(root,0);
        return ans;
    }
    static void traversal(Node root, int level) {
        if(root == null) return;
        traversal(root.left, level+1);
        if(root.left == null && root.right == null){
            if(lvl == -1) lvl = level;
            else if(lvl != level) ans = false;
        }
        traversal(root.right, level+1);
    }
}
