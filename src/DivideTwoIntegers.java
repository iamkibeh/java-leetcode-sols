package src;

//Given two integers dividend and divisor, divide two integers without using multiplication, division, and mod operator.
public class DivideTwoIntegers {
    public static void main(String[] args) {
        System.out.println(divide(10, 3));
        System.out.println(divide(7, -3));
        System.out.println(divide(-1, 1));
        System.out.println(divide(-1, -1));
    }

    private static int divide(int dividend, int divisor) {
        int count = 0, currentSum = 0;
        while (Math.abs(currentSum) <= Math.abs(dividend)) {
            currentSum+=divisor;
            if (Math.abs(currentSum) <= Math.abs(dividend)) count++;
        }
        if (divisor < 0 && dividend < 0) return count;
        if(divisor < 0 || dividend < 0 ) return -count;
        return count;
    }
}


// My approach
// use addition. keep track of count, add divisor to current sum while current sum is less than dividend
// return count