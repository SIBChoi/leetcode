class Solution {
    public boolean isPrefixString(String s, String[] words) {
        String tmp = "";
        
        for (String str: words) {
            tmp += str;
            if(tmp.equals(s)) {
                return true;
            } else if(tmp.length() > s.length()) {
                return false;
            }
        }
     
        return false;
    }
}