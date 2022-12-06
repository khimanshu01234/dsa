import java.util.ArrayList;
import java.util.Collections;

class Node {
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
}
public class binarySearchTreesQ6 {
    int i;
    Node binaryTreeToBST(Node root){
        ArrayList<Integer> nodes = new ArrayList<>();
        inorderTraversal(root, nodes);
        Collections.sort(nodes);
        update(root, nodes);
        return root;
    }
    void inorderTraversal(Node root, ArrayList<Integer> nodes){
        if(root == null) return;
        inorderTraversal(root.left, nodes);
        nodes.add(root.data);
        inorderTraversal(root.right, nodes);
    }
    void update(Node root, ArrayList<Integer> nodes){
        if(root == null) return;
        update(root.left, nodes);
        root.data = nodes.get(i++);
        update(root.right, nodes);
    }
}
