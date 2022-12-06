public class LinkedListQ3T2 {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null){
            return list2;
        }
        if(list2==null){
            return list1;
        }
        if(list1.val < list2.val){
            list1.next = mergeTwoLists(list1.next,list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
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
