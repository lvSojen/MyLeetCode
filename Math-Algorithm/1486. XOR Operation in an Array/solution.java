// Link
// https://leetcode.com/submissions/detail/717439881/
class Solution {
    public int xorOperation(int n, int start) {
        int increment = start;
        for(int i =1;i<=n-1;i++) {
            increment+=2;
            start ^=increment;
        }
        return start;
    }
}
// Alternative
class Solution {
    public int xorOperation(int n, int start) {
        int[] nums = new int[n];
        
        int result = 0;
        
        for(int i = 0; i < n; i++){
            nums[i] = start + (2 * i);
            
            result = result ^ nums[i];
        }
        
        return result;
    }
}