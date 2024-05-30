package src;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{3, 2, 2, 3}, 3));
        System.out.println(removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2));
    }

    public static int removeElement(int[] nums, int val) {
        int i = 0, j = 0, diff = 0, count = 0;
        while (i < nums.length || j < nums.length) {
            if (i < nums.length && nums[i] == val) {
                i++;
            } else if (i < nums.length && nums[i] != val) {
                nums[j++] = nums[i++];
                count++;
            } else {
                diff = Math.max(diff, i - j);
                nums[j++] = 0;
            }
        }
        System.out.println(Arrays.toString(nums));
        return count;

//        int ind= 0;
//        for (int i = 0; i < nums.length ; i++) {
//            if(nums[i] != val){
//                nums[ind++] = nums[i];
//            }
//
//        }
//        return ind;
    }

//    3     2     2     3      value = 3
//                             i
//                j
//    2     2

//   0      1       2       2       3       0       4       2       value = 2
//                                                                 i
//                                          j
//   0      1       3       0       4
}
