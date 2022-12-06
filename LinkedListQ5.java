import java.util.HashSet;

public class LinkedListQ5 {
    static class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }
    public static Node removeDuplicates(Node head) {
        if(head == null) return null;
        HashSet<Integer> set = new HashSet<>();
        Node curr = head;
        set.add(head.data);
        while (curr.next!= null){
            if(set.contains(curr.next.data)){
                curr.next = curr.next.next;
            } else {
                set.add(curr.next.data);
                curr = curr.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        Node n4 = new Node(5);
        Node n3 = new Node(2);
        Node n2 = new Node(5);
        Node n1 = new Node(2);
        n4.next = n3;
        n3.next = n2;
        n2.next = n1;
        Node temp = removeDuplicates(n4);
        while (temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
