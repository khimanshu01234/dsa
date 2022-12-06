import java.util.Scanner;
public class ArrayQ5T2 {
    public static String longestCommonPrefix(String[] strs) {
        String ans = strs[0];
        for (int i = 1; i < strs.length; i++){
            while (!strs[i].startsWith(ans)){
                ans = ans.substring(0,ans.length()-1);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String[] arr = {"ab", "a"};
        System.out.println(longestCommonPrefix(arr));
    }
}
