class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap();
        ArrayList<Integer> result = new ArrayList<>();
        
        for (int n1: nums1) {
            map.put(n1, map.getOrDefault(n1, 0) + 1);
        }
        
        for (int n2: nums2) {
            if(map.containsKey(n2) && map.get(n2) > 0) {
                result.add(n2);
                map.put(n2, map.get(n2) - 1);
            }
        }
        
        int[] r = new int[result.size()];
        
        for (int i = 0; i < result.size(); i++) {
            r[i] = result.get(i);
        }
        
        return r;
        
//         HashMap<Integer, Integer> map2 = new HashMap();
        
//         for (int item: nums1) {
//             map1.put(item, map1.getOrDefault(item, 0) + 1);
//         }
        
        
        
//         for (int item: nums2) {
//             map2.put(item, map2.getOrDefault(item, 0) + 1);
//         }
        
//         // System.out.print(map2.entrySet());
        
//         ArrayList<Integer> result = new ArrayList<>();
        
//         for (int key: map1.keySet().toArray(new Integer[map1.size()])) {
//             int v1 = map1.get(key) == null ? 0 : map1.get(key) ;
//             int v2 = map2.get(key) == null ? 0 : map2.get(key) ;
            
//             if (v1 > 0 && v2 > 0) {
//                 int min = Math.min(v1, v2);

                
//                 for (int i = 0; i < min; i++) {
//                     result.add(key);
//                 }
//             }
//         }
        
//         int[] output = new int[result.size()];
        
//         for (int i = 0; i < result.size(); i++) {
//             output[i] = result.get(i);
//         }
        
//         return output;
    }
}