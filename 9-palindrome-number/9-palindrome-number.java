class Solution {
    public boolean isPalindrome(int x) {
        return String.valueOf(x).equals(new StringBuilder(String.valueOf(x)).reverse().toString());
//        if (x < 0) {
//            return false;
//        }
        
//         int remain, original = x;
//         int reversed = 0;
        
//         while(x > 0) {
//             remain = x % 10;
//             reversed = reversed * 10 + remain;
//             x /= 10;
//         }
        
//         return original == reversed;
    }
}