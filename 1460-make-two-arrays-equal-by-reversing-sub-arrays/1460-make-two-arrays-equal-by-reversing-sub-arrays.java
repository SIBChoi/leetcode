class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        if (target.length == 1 && arr.length == 1) {
            return target[0] == arr[0];
        }
        
        boolean isEqual = false;
        
        for (int i = 0; i < target.length; i++) {
            isEqual = false;
            for(int j = i; j < arr.length; j++) {
                if(target[i] == arr[j]) {
                    isEqual = true;
                    swap(arr, i, j);
                    continue;
                }        
            }
            if(!isEqual) {
                break;
            }
        }
        
        return isEqual;
    }
    
    public void swap(int[] arr, int start, int end) {
        if (start == end) {
            return;
        }
        
        int tmp = arr[start];
        arr[start] = arr[end];
        arr[end] = tmp;
        
        swap(arr, start + 1, end);
    }
}