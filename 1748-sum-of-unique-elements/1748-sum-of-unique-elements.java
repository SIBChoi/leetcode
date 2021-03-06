class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap();
        int output = 0;
        
//         for (int i = 0; i < nums.length; i++) {
//             if(map.containsKey(nums[i])) {
//                 map.put(nums[i], map.get(nums[i]) + 1);
//             } else {
//                 map.put(nums[i], 1);
//             }
//         }
        
//         for (int key: map.keySet().toArray(new Integer[map.size()])) {
//             if(map.get(key) == 1) {
//                 output += key;
//             }
//         }
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            if(map.get(nums[i]) == 1) {
                output += nums[i];
            } else if(map.get(nums[i]) == 2) {
                output -= nums[i];
            }
        }
        return output;
    }
}