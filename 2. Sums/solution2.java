class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans[] = new int[2];
        int restOfSum =0;

        for(int i=0; i< nums.length-1; i++) {

            restOfSum = target - nums[i]; 
            for(int j = i+1; j <nums.length; j++) {
                if(nums[j] == restOfSum) {
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        return ans;
    }
}