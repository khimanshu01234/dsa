public class binarySearchTreesQ2 {
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
    Node insert(Node root, int Key) {
        if(root == null) return new Node(Key);
        Node temp = root;
        while (true){
            if(temp.data == Key){
                return root;
            } else if(temp.data > Key){
                if (temp.left != null) temp = temp.left;
                else {
                    temp.left = new Node(Key);
                    return root;
                }
            } else {
                if (temp.right != null) temp = temp.right;
                else {
                    temp.right = new Node(Key);
                    return root;
                }
            }
        }
    }
}
