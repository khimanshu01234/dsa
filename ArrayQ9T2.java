import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
public class ArrayQ9T2 {
    public static ArrayList<Integer> repeatedNumber(final List<Integer> A) {
        HashSet<Integer> set1 = new HashSet<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        long Diff = 0;int a = 0;
        for (int i = 0; i < A.size(); i++){
            if(!set1.add(A.get(i))){
                a = A.get(i);
            }
            Diff += (i+1) - A.get(i);
        }
        int b = a + (int)Diff;
        list1.add(a);
        list1.add(b);
        return list1;
    }

    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        l1.add(3);
        l1.add(1);
        l1.add(2);
        l1.add(5);
        l1.add(3);
        ArrayList<Integer> l2= repeatedNumber(l1);
        System.out.println(l2);
    }
}
