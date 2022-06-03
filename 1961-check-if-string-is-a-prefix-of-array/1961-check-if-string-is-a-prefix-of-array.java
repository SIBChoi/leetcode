class Solution {
    public boolean isPrefixString(String s, String[] words) {
        StringBuilder sb = new StringBuilder();
        
        for (String str: words) {
            sb.append(str);
            if (s.equals(sb.toString())) {
                return true;
            } else if (s.indexOf(sb.toString()) == -1) {
                return false;
            }
        }
        
        return false;
        
//         String tmp = "";
        
//         for (String str: words) {
//             tmp += str;
//             if(tmp.equals(s)) {
//                 return true;
//             } else if(tmp.length() > s.length()) {
//                 return false;
//             }
//         }
     
//         return false;
    }
}