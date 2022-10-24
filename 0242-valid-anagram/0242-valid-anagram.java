class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        
        boolean anagram = true;
        
        Map<String, Integer> map = new HashMap<>();
        
        for (String s1 : s.split("")) {
            map.put(s1, map.getOrDefault(s1, 0) + 1);
        }
        
        for (String t1 : t.split("")) {
            if (!map.containsKey(t1)) {
                anagram = false;
                break;
            } else {
                map.put(t1, map.getOrDefault(t1, 0) - 1);
                
                if (map.get(t1) < 0) {
                    anagram = false;
                    break;
                }
            }
        }
        
        
        
        return anagram;
    }
}