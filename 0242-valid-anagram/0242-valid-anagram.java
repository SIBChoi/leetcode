class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        
        boolean anagram = true;
        
        String[] s1 = s.split("");
        String[] s2 = t.split("");
        
        Arrays.sort(s1);
        Arrays.sort(s2);
        
        for (int i = 0; i < s1.length; i++) {
            if (!s1[i].equals(s2[i])) {
                anagram = false;
                break;
            }
        }
        
        return anagram;
    }
}