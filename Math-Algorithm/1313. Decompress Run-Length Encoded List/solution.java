// Link
// https://leetcode.com/submissions/detail/716614073/
class Solution {
    public int[] decompressRLElist(int[] nums) {
        int arrSize = 0;
        for(int i=0; i<nums.length;i+=2) {
            arrSize +=nums[i];
        }
        int[] res = new int[arrSize];
        int count =0;
        for(int i=0; i<nums.length;i+=2) {
            int loopTimes = nums[i];
            while(loopTimes>0) {
                res[count] = nums[i+1];
                count ++;
                loopTimes--;
            }
        }
        return res;
    }
}
// Alternative
class Solution {
    public int[] decompressRLElist(int[] nums) {
        int arrSize = 0;
        for (int i = 0; i < nums.length; i += 2) {
            arrSize += nums[i];
        }
        
        int[] result = new int[arrSize];

        int startIdx = 0;
        for (int i = 0; i < nums.length; i += 2) {
            Arrays.fill(result, startIdx, startIdx + nums[i], nums[i + 1]);
            startIdx += nums[i];
        }
        return result;
    }
}