import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class binaryTreesQ2 {
    static class Node {
        int data;
        Node left, right;
        Node(int item) {
            data = item;
            left = right = null;
        }
    }
    public ArrayList<Integer> reverseLevelOrder(Node node) {
        LinkedList<Integer> ans = new LinkedList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        while(!queue.isEmpty()){
            if(queue.peek().right != null) queue.add(queue.peek().right);
            if(queue.peek().left != null) queue.add(queue.peek().left);
            ans.addFirst(queue.poll().data);
        }
        return new ArrayList<>(ans);
    }
}
