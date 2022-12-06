public class binaryTreesQ16 {
    class Node {
        int data;
        Node left, right;
        Node(int item) {
            data = item;
            left = right = null;
        }
    }
    int height(Node node) {
        if(node == null) return 0;
        return Math.max(height(node.right),height(node.left))+1;
    }
}
