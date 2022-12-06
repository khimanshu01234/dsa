import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class binaryTreesQ6 {
    static class Node {
        int data;
        Node left, right;
        Node(int item) {
            data = item;
            left = right = null;
        }
    }
    static ArrayList<Integer> leftView(Node root) {
        Queue<Node> queue = new LinkedList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null) return ans;
        queue.add(root);
        while (!queue.isEmpty()){
            ans.add(queue.peek().data);
            int size = queue.size();
            for (int i = 0; i < size; i++){
                if(queue.peek().left != null) queue.add(queue.peek().left);
                if(queue.peek().right != null) queue.add(queue.peek().right);
                queue.poll();
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        Node left = new Node(3);
        Node right = new Node(2);
        root.left = left;
        root.right = right;
        ArrayList<Integer> ans = leftView(root);
        for (int i : ans){
            System.out.print(i+" ");
        }

    }
}
