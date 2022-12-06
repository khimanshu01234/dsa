import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

public class binaryTreesQ19 {
    static class Pair{
        int x;
        Node root;
        public Pair(int x, Node root) {
            this.x = x;
            this.root = root;
        }
    }
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }
    static ArrayList<Integer> topView(Node root) {
        if(root == null) return new ArrayList<>();
        TreeMap<Integer,Integer> map = new TreeMap<>();
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(0,root));
        while(!queue.isEmpty()){
            Pair temp = queue.poll();
            map.put(temp.x,temp.root.data);
            if(temp.root.left != null) queue.add(new Pair(temp.x-1,temp.root.left));
            if(temp.root.right != null) queue.add(new Pair(temp.x+1,temp.root.right));
        }
        return new ArrayList<>(map.values());
    }
}
