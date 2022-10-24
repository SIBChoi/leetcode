class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean result = false;
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        
        for (Map.Entry<Integer, Integer> item : map.entrySet()) {
            if (item.getValue() > 1) {
                result = true;
                break;
            }
        }
        
        return result;
    }
}