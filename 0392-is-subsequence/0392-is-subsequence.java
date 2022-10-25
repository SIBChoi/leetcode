class Solution {
    public boolean isSubsequence(String s, String t) {
        if ("".equals(s)) {
            return true;
        }
        
        int idx2 = 0;
        for (int i = 0; i < t.length() && idx2 < s.length(); i++) {
            if (s.charAt(idx2) == t.charAt(i)) {
                idx2++;
            }
        }
        
        return idx2 == s.length();
 
    }
}