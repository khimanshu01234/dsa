import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class binaryTreesQ7 {
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
    public static List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        traversal(root,ans,0);
        return ans;
    }
    public static void traversal(TreeNode root, List<Integer> ans, int level){
        if(root == null) return;
        if(level == ans.size()) ans.add(root.val);
        traversal(root.left,ans,level+1);
        traversal(root.right,ans,level+1);
    }
}
