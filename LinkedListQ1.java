public class LinkedListQ1 {
    static class node{
        int val;
        node next;
        node(int val){
            this.val = val;
        }
        node(int val, node next) {
            this.val = val;
            this.next = next;
        }
    }
    public static node reverseList(node head) {
        node newHead = null;
        while (head!=null){
            node next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }
        return newHead;
    }
    public static node reverseListRecursive(node head) {
        if(head == null || head.next == null){
            return head;
        }
        node newHead = reverseListRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
    public static void main(String[] args) {
        node n5 = new node(5);
        node n4 = new node(4, n5);
        node n3 = new node(3, n4);
        node n2 = new node(2, n3);
        node n1 = new node(1, n2);
        node t = reverseListRecursive(n1);
        while (t != null) {
            System.out.println(t.val);
            t = t.next;
        }
    }
}
