import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class binaryTreesQ8 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> ans = new LinkedList<>();
        if(root == null) return ans;
        queue.add(root);
        boolean leftToRight = true;
        while (!queue.isEmpty()){
            int size = queue.size();
            LinkedList<Integer> temp = new LinkedList<>();
            for (int i = 0; i < size; i++){
                if(queue.peek().left != null) queue.add(queue.peek().left);
                if(queue.peek().right != null) queue.add(queue.peek().right);
                if(leftToRight) temp.add(queue.poll().val);
                else temp.addFirst(queue.poll().val);
            }
            ans.add(temp); leftToRight = !leftToRight;
        }
        return ans;
    }
}
