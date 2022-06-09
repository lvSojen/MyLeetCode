// Link
// https://leetcode.com/submissions/detail/718340824/
class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int left =0;
        int right = nums.length-1;
        int total =0;
        int max =0;
        while(left <right) {
            total = nums[left] +nums[right];
            max = total > max ? total:max;
            left++;
            right--;
        }
        return max;
    }
}
// Alternative
class Solution {
    public int minPairSum(int[] A) {
        Arrays.sort(A);
        int res = 0, n = A.length;
        for (int i = 0; i < n / 2; ++i)
            res = Math.max(res, A[i] + A[n - i - 1]);
        return res;
    }
}