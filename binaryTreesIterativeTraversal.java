import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class binaryTreesIterativeTraversal {
    public static class Pair{
        TreeNode root;
        int num;
        Pair(TreeNode root, int num){
            this.root = root;
            this.num = num;
        }
    }
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
    public static List<Integer> preorderTraversal(TreeNode root) {
        Deque<TreeNode> stack = new LinkedList<>();
        LinkedList<Integer> ans = new LinkedList<>();
        if(root == null) return ans;
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode temp = stack.pop();
            ans.add(temp.val);
            if(temp.right!= null) stack.push(temp.right);
            if(temp.left!= null) stack.push(temp.left);
        }
        return ans;
    }
    public static List<Integer> inorderTraversal(TreeNode root) {
        Deque<TreeNode> stack = new LinkedList<>();
        LinkedList<Integer> ans = new LinkedList<>();
        TreeNode temp = root;
        while (temp != null || !stack.isEmpty()) {
            while (temp != null) {
                stack.push(temp);
                temp = temp.left;
            }
            temp = stack.pop();
            ans.add(temp.val);
            temp = temp.right;
        }
        return ans;
    }
    public static List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        LinkedList<Integer> ans = new LinkedList<>();
        if(root == null) return ans;
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode curr = stack.pop();
            ans.addFirst(curr.val);
            if(curr.left != null) stack.push(curr.left);
            if(curr.right != null) stack.push(curr.right);
        }
        return ans;
    }
    public static void preInPostTraversal(TreeNode root){
        Stack<Pair> stack = new Stack<>();
        stack.push(new Pair(root,1));
        LinkedList<Integer> pre = new LinkedList<>();
        LinkedList<Integer> in = new LinkedList<>();
        LinkedList<Integer> post = new LinkedList<>();
        if (root == null) return;
        while (!stack.isEmpty()){
            if(stack.peek().num == 1){
                pre.add(stack.peek().root.val);
                stack.peek().num++;
                if(stack.peek().root.left != null) stack.push(new Pair(stack.peek().root.left,1));
            } else if(stack.peek().num == 2){
                in.add(stack.peek().root.val);
                stack.peek().num++;
                if(stack.peek().root.right != null) stack.push(new Pair(stack.peek().root.right,1));
            } else {
                post.add(stack.peek().root.val);
                stack.pop();
            }
        }
    }
}
