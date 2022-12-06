import java.util.ArrayList;
import java.util.List;

public class binaryTreesMorrisTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        TreeNode curr = root;
        List<Integer> list = new ArrayList<>();
        while (curr != null){
            if(curr.left == null){
                list.add(curr.val);
                curr = curr.right;
            } else {
                TreeNode temp = curr.left;
                while (temp.right != null && temp.right != curr) temp = temp.right;
                if(temp.right == null){
                    temp.right = curr;
                    curr = curr.left;
                } else {
                    temp.right = null;
                    list.add(curr.val);
                    curr = curr.right;
                }
            }
        }
        return list;
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        TreeNode curr = root;
        List<Integer> list = new ArrayList<>();
        while (curr != null){
            if(curr.left == null){
                list.add(curr.val);
                curr = curr.right;
            } else {
                TreeNode temp = curr.left;
                while (temp.right != null && temp.right != curr) temp = temp.right;
                if(temp.right == null){
                    temp.right = curr;
                    list.add(curr.val);
                    curr = curr.left;
                } else {
                    temp.right = null;
                    curr = curr.right;
                }
            }
        }
        return list;
    }
}
