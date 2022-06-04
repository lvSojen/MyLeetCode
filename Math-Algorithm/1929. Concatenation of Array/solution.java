// Link
// https://leetcode.com/submissions/detail/714439282/
class Solution {
    public int[] getConcatenation(int[] nums) {
        int givenSize = nums.length;
        int[] result = new int[givenSize*2];

        System.arraycopy(nums, 0, result, 0, givenSize);
        System.arraycopy(nums, 0, result, givenSize, givenSize);
        // System.arraycopy(array1, 0, result, 0, aLen);
        // System.arraycopy(array2, 0, result, aLen, bLen);
        return result;
    }
}
// Alternative
class Solution {
    public int[] getConcatenation(int[] nums) {
        int size = nums.length;
        int newSize=2*size;
        int[] ans = new int[newSize];
        for (int i = 0; i<newSize; i++){
            ans[i]=nums[i%size];
        }
        return ans;
    }
}