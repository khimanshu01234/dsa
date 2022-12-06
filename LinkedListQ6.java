public class LinkedListQ6 {
    static class Node {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            next = null;
        }
    }
    static Node segregate(Node head) {
        Node curr = head;
        int[] arr = new int[3];
        while (curr != null){
            arr[curr.data]++;
            curr = curr.next;
        }
        curr = head;
        while (arr[0]>0){
            curr.data = 0;
            curr = curr.next;
            arr[0]--;
        }
        while (arr[1]>0){
            curr.data = 1;
            curr = curr.next;
            arr[1]--;
        }
        while (arr[2]>0){
            curr.data = 2;
            curr = curr.next;
            arr[2]--;
        }
        return head;
    }
    public static void main(String[] args) {
        Node n4 = new Node(2);
        Node n3 = new Node(1);
        Node n2 = new Node(2);
        Node n1 = new Node(0);
        n4.next = n3;
        n3.next = n2;
        n2.next = n1;
        Node temp = segregate(n4);
        while (temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
