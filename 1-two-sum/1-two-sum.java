import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap();
        int[] output = new int[2];
        
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                output[0] = map.get(nums[i]);
                output[1] = i;
                return output;
            } else {
                map.put(target - nums[i], i);
            }
        }
        
        return output;
    }
}