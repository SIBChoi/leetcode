class Solution {
    public int removeDuplicates(int[] nums) {
//         int pointer = 0;
        
//         for (int i = 0; i < nums.length; i++) {
//                 if (i == 0) {
//                     pointer++;
//                 }
            
//                 if (nums[pointer] != nums[i]) {
//                     nums[pointer] = nums[i];
//                     pointer++;
//                 }
//         }
        
//         return ++pointer;
        
           int i = 0;
    for (int n : nums)
        if (i == 0 || n > nums[i-1])
            nums[i++] = n;
    return i;
    }
}