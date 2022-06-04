// Link
// https://leetcode.com/submissions/detail/714435461/
class Solution {
    public int[] buildArray(int[] nums) {
        int lastIndex = nums.length-1;
        int[] result = new int [nums.length];
        for(int i=0; i<result.length;i++) {
            result[i] = nums[nums[i]];
        }
        return result;
    }
}
// Alternative
class Solution {
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int [n];
        permute( nums, ans, 0);
        return ans;
    }
    public void permute( int[] nums, int[] ans, int i ){
        if( i == nums.length ) return;
        ans[i] = nums[nums[i]];
        permute( nums, ans, (i+1));
    }
}
