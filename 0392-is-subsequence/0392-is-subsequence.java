class Solution {
    public boolean isSubsequence(String s, String t) {
        // if ("".equals(s)) {
        //     return true;
        // }
        
//         boolean answer = false;
        
//         int idx2 = 0;
//         for (int i = 0; i < t.length(); i++) {
        //     if (s.charAt(idx2) == t.charAt(i)) {
        //         idx2++;
        //         if (idx2 == s.length()) {
        //             answer = true;
        //             break;
        //         }
        //     }
        // }
        
        // return answer;
        
         if (s.length() == 0) return true;
        int indexS = 0, indexT = 0;
        while (indexT < t.length()) {
            if (t.charAt(indexT) == s.charAt(indexS)) {
                indexS++;
                if (indexS == s.length()) return true;
            }
            indexT++;
        }
        return false;
    }
}