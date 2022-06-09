// Link
// https://leetcode.com/submissions/detail/718321149/
class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length-1]*nums[nums.length-2]-nums[0]*nums[1];
    }
}
// Alternative
class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int res=(nums[n-1]*nums[n-2])-(nums[0]*nums[1]);
        return res;
    }
}