class Solution {
    public boolean isSubsequence(String s, String t) {
        if ("".equals(s)) {
            return true;
        }
        
        boolean answer = false;
        
        int idx2 = 0;
        for (int i = 0; i < t.length(); i++) {
            if (s.charAt(idx2) == t.charAt(i)) {
                idx2++;
                if (idx2 == s.length()) {
                    answer = true;
                    break;
                }
            }
        }
        
        return answer;
    }
}