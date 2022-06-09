// Link
// https://leetcode.com/submissions/detail/718318391/
class Solution {
    public int countPairs(int[] nums, int k) {
        int count =0;
        int left =0;
        int right =0;
        while(left <nums.length-1) {
            right =left+1;
            while(right <nums.length) {
                if(nums[left]==nums[right] && (left*right%k==0)) {
                    count++;
                }
                right++;
            }
            left++;
        }
        return count;
    }
}
// Alternative
class Solution {
    public int countPairs(int[] nums, int k) {
        int c = 0;
        for(int i = 0; i < nums.length; i++)
        {
            for(int j = i+1; j < nums.length; j++)
            {
                if(nums[i] == nums[j] && (i*j)%k == 0)
                    c++;
            }
        }
        return c;
    }
}