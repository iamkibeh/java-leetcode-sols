package src;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[] {1,1,2})); // 2
        System.out.println(removeDuplicates(new int[] {0,0,1,1,1,2,2,3,3,4})); // 5
    }

    public  static int removeDuplicates(int[] nums) {
        int i=0, j=1;
        while (i < nums.length && j< nums.length) {
            if(nums[i]==nums[j]){
                j++;
            }
            else {
                nums[i+1] = nums[j++];
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return i + 1;
    }
}

// 0    0     1     1       1       2       2       3       3       4
//                          i
//                                                                         j
// 0    1      2    3       4