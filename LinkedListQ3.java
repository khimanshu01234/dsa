public class LinkedListQ3 {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode fakeHead = new ListNode(0);
        ListNode curr = fakeHead;
        while (list1 != null && list2 != null){
            if(list1.val < list2.val){
                curr.next = list1;
                list1 = list1.next;
            } else {
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }
        curr.next = (list1!=null)? list1: list2;
        return fakeHead.next;
    }
    public static void main(String[] args) {
        ListNode n3 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n1 = new ListNode(4);
        n3.next = n2;
        n2.next = n1;
        ListNode m3 = new ListNode(1);
        ListNode m2 = new ListNode(3);
        ListNode m1 = new ListNode(4);
        m3.next = m2;
        m2.next = m1;
        ListNode temp = mergeTwoLists(n3,m3);
        while (temp!=null){
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
}
