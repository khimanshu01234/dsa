public class LinkedListQ2 {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public static boolean hasCycle(ListNode head) {
        if(head == null){
            return false;
        }
        ListNode temp1 = head,temp2 = head;
        while(temp2!=null && temp2.next!=null){
            temp1 = temp1.next;
            temp2 = temp2.next.next;
            if(temp1==temp2){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode n5 = new ListNode(1);
        ListNode n4 = new ListNode(2);
        n5.next = n4;
        System.out.println(hasCycle(n5));
    }
}
