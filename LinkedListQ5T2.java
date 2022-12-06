public class LinkedListQ5T2 {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }
    static Node compute(Node head){
        if(head == null || head.next == null) return head;
        head.next = compute(head.next);
        return (head.data < head.next.data) ? head.next : head;
    }
}
