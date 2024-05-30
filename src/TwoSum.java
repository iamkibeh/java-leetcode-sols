package src;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length ; i++) {
            int lookup = target - nums[i];
            if (map.containsKey(lookup)) {
                return new int[]{map.get(lookup), i};
            }
            map.put(nums[i], i);
        }

        return new int[] {-1, -1};
    }
}
