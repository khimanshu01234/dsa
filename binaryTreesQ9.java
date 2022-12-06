public class binaryTreesQ9 {
    static class node {
        int val;
        node left;
        node right;
    }
    public static node mirrorTree(node root) {
        if (root == null) return null;
        node left = root.left, right = root.right;
        root.left = mirrorTree(left);
        root.right = mirrorTree(right);
        return root;
    }
}
