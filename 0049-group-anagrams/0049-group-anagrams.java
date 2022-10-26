class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        
        for (String s : strs) {
            char[] cArr = new char[26];
            for (char c : s.toCharArray()) {
                cArr[c - 'a']++;
            }
            String key = String.valueOf(cArr);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList());
            }
            map.get(key).add(s);
        }
        return new ArrayList(map.values());
    }
}