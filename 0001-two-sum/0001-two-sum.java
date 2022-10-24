class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] answer = new int[2];        
        
        for (int i = 0; i < nums.length; i++) {
            map.put(target - nums[i], i);
        }
        
        int idx = 0;
        for (int n : nums) {
            if (map.containsKey(n) && map.get(n) != idx) {
                answer[0] = idx;
                answer[1] = map.get(n);
                break;
            }
            idx++;
        }
        
        return answer;
    }
}