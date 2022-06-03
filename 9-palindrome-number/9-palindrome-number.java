class Solution {
    public boolean isPalindrome(int x) {
        String[] strX = Integer.toString(x).split("");
        
        if (strX[0].equals("-")) {
            return false;
        }
        
        System.out.print(Arrays.toString(strX));
        
        boolean isPalindromFlag = true;
        int left = 0;
        int right = strX.length - 1;
        
        while (left < right) {
            if(Integer.parseInt(strX[left]) != Integer.parseInt(strX[right])) {
                isPalindromFlag = false;
                break;
            } else {
                left++;
                right--;
            }
        }
        
        if(left == right) {
            isPalindromFlag = true;
        }
        
        
        return isPalindromFlag;
    }
}