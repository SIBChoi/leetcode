class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] answer = new int[2];        
        
        int idx = 0;
        for (int n : nums) {
            int sub = target - n;
            if(map.containsKey(sub)) {
                answer[0] = map.get(sub);
                answer[1] = idx;
                break;
            } else {
                map.put(n, idx);
                idx++;
            }
        }
        
        return answer;
    }
}