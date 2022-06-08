// Link
// https://leetcode.com/submissions/detail/717424154/
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count =0;
        for(int i =0; i<nums.length-1; i++) {
            for(int j =i+1; j<nums.length;j++){
                if(nums[i]==nums[j]) {
                    count ++;
                }
            }
        }
        return count;
    }
}
// Alternative
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int res = 0;
        int map[] = new int[101];
        for (var n:nums) {
            ++map[n];
        }
        for (int i=0; i<=100;i++) {
	// find duplicates that's over 2
            res += map[i]*(map[i]-1)/2;
        }
        return res;
    }
}