public class binarySearchTreesQ4 {
    static class Node {
        int data;
        Node left, right;
        Node(int item) {
            data = item;
            left = right = null;
        }
    }
    static class Res{
        Node pre = null;
        Node succ = null;
    }
    public static void findPreSuc(Node root, Res p, Res s, int key) {
        Node curr = root;
        while (curr != null && curr.data != key){
            if(curr.data > key){
                s.succ = curr;
                curr = curr.left;
            } else {
                p.pre = curr;
                curr = curr.right;
            }
        }
        if(curr != null) {
            Node leftTree = curr.left;
            while (leftTree != null) {
                p.pre = leftTree;
                leftTree = leftTree.right;
            }
            Node rightTree = curr.right;
            while (rightTree != null) {
                s.succ = rightTree;
                rightTree = rightTree.left;
            }
        }
    }
}
