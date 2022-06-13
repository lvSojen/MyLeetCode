// Link
// https://leetcode.com/submissions/detail/720857201/
class Solution {
    public int maxSubArray(int[] nums) {
        int size = nums.length;
        int[] res = new int[size];
        res[0] = nums[0];
        int max = Integer.MIN_VALUE;
        for(int i =1; i<size; i++) {
            res[i] = Math.max(nums[i],nums[i]+res[i-1]);
        }
        for(int num: res) {
            max = num > max ? num : max;
        }
        return max;
    }
}
// Alternative
class Solution {
    public int maxSubArray(int[] nums) {
        int maxSoFar=nums[0];
        int maxEndingHere=nums[0];
        for (int i=1;i<nums.length;++i){
            maxEndingHere= Math.max(maxEndingHere+nums[i],nums[i]);
            maxSoFar=Math.max(maxSoFar, maxEndingHere);	
        }
        return maxSoFar;
    }
}