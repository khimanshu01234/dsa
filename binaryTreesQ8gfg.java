import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class binaryTreesQ8gfg {
    static class Node {
        int data;
        Node left, right;
        Node(int item) {
            data = item;
            left = right = null;
        }
    }
    ArrayList<Integer> zigZagTraversal(Node root) {
        Queue<Node> queue = new LinkedList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        if(root == null) return ans;
        boolean leftToRight = true;
        queue.add(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            LinkedList<Integer> temp = new LinkedList<>();
            for (int i = 0; i < size; i++){
                if(queue.peek().left != null) queue.add(queue.peek().left);
                if(queue.peek().right != null) queue.add(queue.peek().right);
                if(leftToRight) temp.add(queue.poll().data);
                else temp.addFirst(queue.poll().data);
            }
            ans.addAll(temp);
            leftToRight = !leftToRight;
        }
        return ans;
    }
}
