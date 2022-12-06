public class binarySearchTreesQ7 {
    class Node {
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data = data;
            left=null;
            right=null;
        }
    }
    int count = 0, ans = 0;
    public int kthLargest(Node root,int K){
        helper(root, K);
        return ans;
    }
    public void helper(Node root,int K){
        if(root == null) return;
        helper(root.right, K);
        count++;
        if(count == K){
            ans = root.data;
            return;
        }
        helper(root.left, K);
    }
}
