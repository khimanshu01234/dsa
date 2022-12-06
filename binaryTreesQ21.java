import java.util.ArrayList;
import java.util.LinkedList;

public class binaryTreesQ21 {
    class Node {
        int data;
        Node left, right;
        public Node(int d) {
            data = d;
            left = right = null;
        }
    }
    ArrayList<Integer> boundary(Node node) {
        ArrayList<Integer> ans = new ArrayList<>();
        if(node == null) return ans;
        if(node.left != null || node.right != null) ans.add(node.data);
        Node curr = node.left;
        while (curr != null){
            if(curr.left != null || curr.right != null) ans.add(curr.data);
            if(curr.left == null) curr = curr.right;
            else curr = curr.left;
        }
        addLeaf(ans,node);
        LinkedList<Integer> temp1 = new LinkedList<>();
        curr = node.right;
        while (curr != null){
            if(curr.left != null || curr.right != null) temp1.addFirst(curr.data);
            if(curr.right == null) curr = curr.left;
            else curr = curr.right;
        }
        ans.addAll(temp1);
        return ans;
    }
    void addLeaf(ArrayList<Integer> ans, Node node){
        if(node == null) return;
        addLeaf(ans,node.left);
        if(node.left == null && node.right == null) ans.add(node.data);
        addLeaf(ans,node.right);
    }
}
