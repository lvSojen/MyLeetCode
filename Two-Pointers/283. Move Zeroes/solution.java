// Link
// https://leetcode.com/submissions/detail/718959408/
class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0;
        int right = 0;
        while(left<nums.length-1) {
            right = left+1;
            if(nums[left]==0){
                while(nums[right]==0 && right <nums.length-1){
                    right++;
                    if(right == nums.length-1 && nums[right]==0){
                        break;
                    }
                }
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }
            left++;
        }
    }
}
// Alternative
class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != 0)
                nums[i++] = nums[j];
        }
        for (int j = i; j < nums.length; j++) {
            nums[j] = 0;
        }
    }
}