public class ArrayQ2 {
    public static String reverseWord(String str) {
        String newStr = "";
        for (int i = 0; i < str.length(); i++){
            newStr = str.charAt(i) + newStr;
        }
        return newStr;
    }
    public static void main(String[] args) {
    }
}
