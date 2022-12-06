import java.util.ArrayList;
import java.util.List;
public class ArrayQ9 {
    public static ArrayList<Integer> repeatedNumber(final List<Integer> A) {
        ArrayList<Integer> list1 = new ArrayList<>();
        long Sum = 0, SqSum = 0;
        for (int i = 0; i < A.size(); i++){
            Sum += (i+1) - A.get(i);
            SqSum += (long)((Math.pow(i+1,2) - Math.pow(A.get(i),2)));
        }
        int sumAAndB = (int)(SqSum/Sum);
        list1.add((int)(sumAAndB-Sum)/2);
        list1.add((int)(sumAAndB+Sum)/2);
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
