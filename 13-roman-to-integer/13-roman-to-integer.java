class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap();
        map.put('M', 1000);
        map.put('D', 500);
        map.put('C', 100);
        map.put('L', 50);
        map.put('X', 10);
        map.put('V', 5);
        map.put('I', 1);
        
        List<Integer> arr = new ArrayList();
        
        for (char c: s.toCharArray()) {
            int num = map.get(c);
            arr.add(num);
        }
        
        int sum = 0;
        
        for (int i = 0; i < arr.size() - 1; i++) {
            if(arr.get(i) < arr.get(i + 1)) {
                sum -= arr.get(i);
            } else {
                sum += arr.get(i);
            }
        }
     
        return sum + arr.get(arr.size() - 1);
    }
}