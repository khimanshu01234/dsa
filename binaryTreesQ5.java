import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class binaryTreesQ5 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) {this.val = val;}
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public static void traversal(List<List<Integer>> ans, TreeNode root, int level) {
        if (root == null) return;
        if (ans.size() == level) ans.add(new LinkedList<>());
        ans.get(level).add(root.val);
        traversal(ans,root.left,level+1);
        traversal(ans,root.right,level+1);
    }
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        traversal(ans,root,0);
        return ans;
    }
}
