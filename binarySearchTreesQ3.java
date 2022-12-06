public class binarySearchTreesQ3 {
    class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }
    int minValue(Node node) {
        if(node == null) return -1;
        while(node.left != null) node = node.left;
        return node.data;
    }
}
