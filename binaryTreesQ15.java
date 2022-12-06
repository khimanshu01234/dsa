import java.util.HashMap;

public class binaryTreesQ15 {
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
    HashMap<Integer,Integer> map = new HashMap<>();
    int preOrderIndex = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i = 0; i < inorder.length; i++) map.put(inorder[i],i);
        return helper(preorder,0,inorder.length-1);
    }
    public TreeNode helper(int[] preorder, int inStart, int inEnd) {
        if(inStart > inEnd) return null;
        TreeNode node = new TreeNode(preorder[preOrderIndex]);
        int idx = map.get(preorder[preOrderIndex]);
        preOrderIndex++;
        node.left = helper(preorder,inStart,idx-1);
        node.right = helper(preorder,idx+1,inEnd);
        return node;
    }
}
