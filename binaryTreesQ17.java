public class binaryTreesQ17 {
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
    static int max = 0;
    static int diameter(Node root) {
        cal(root);
        return max;
    }
    static int cal(Node root){
        if(root == null) return 0;
        int left = cal(root.left);
        int right = cal(root.right);
        max = Math.max(max,left+right+1);
        return Math.max(left,right)+1;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        Node root1 = new Node(2);
        Node root2 = new Node(3);
        root.left = root1;
        root.right = root2;
        System.out.println(diameter(root));
    }
}
