package src;

public class ReverseInteger {
    public static void main(String[] args) {
        int number = 54321;
        System.out.println(reverseInt(number));
        System.out.println(isPalindrome(number));
        System.out.println(isPalindrome(343));
        System.out.println(isPalindrome(-343));
    }

    private static int reverseInt(int num) {
        long reversed = 0;
        while (num > 0) {
            int rem = num % 10;
            reversed = (reversed * 10) + rem;
            num = num / 10;

            if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
                return 0;
            }
        }
        return (int) reversed;
    }

    private static boolean isPalindrome(int num) {
        int reversedNum = reverseInt(num);
        return reversedNum == num;
    }
}
