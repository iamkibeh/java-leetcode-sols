package src;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello world!";
        System.out.println(reverseWithStringBuilder(str));
        System.out.println(reverseManually(str));
    }
    
    private static String reverseManually(String str) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
    private static String reverseWithStringBuilder(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
