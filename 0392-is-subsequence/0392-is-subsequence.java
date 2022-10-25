class Solution {
    public boolean isSubsequence(String s, String t) {
        if ("".equals(s)) {
            return true;
        }
        
        String[] sArr = s.split("");
        String[] tArr = t.split("");
        boolean answer = false;
        
        int idx2 = 0;
        for (int i = 0; i < tArr.length; i++) {
            if (sArr[idx2].equals(tArr[i])) {
                idx2++;
                if (idx2 == sArr.length) {
                    answer = true;
                    break;
                }
            }
        }
        
        return answer;
    }
}