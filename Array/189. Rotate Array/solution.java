// Link
// https://leetcode.com/submissions/detail/718254817/
class Solution {
    public void rotate(int[] nums, int k) {
        int count =0;
        int chopAt = k%(nums.length);
        int[] answer = new int [nums.length];
        for(int i =nums.length-chopAt; i<nums.length;i++) {
            answer[count++] = nums[i];
        }
        for(int i= 0; i<nums.length-chopAt;i++)     {
            answer[count++] = nums[i];
        }
        count =0;
        for(int num : nums) {
            nums[count] = answer[count++];
        }
    }
}
// Alternative
class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverse(nums, 0, n-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);
    }
    
    private void reverse(int[] nums, int lo, int hi) {
        while (lo < hi) {
            int temp = nums[lo];
            nums[lo++] = nums[hi];
            nums[hi--] = temp;
        }
    }
}
// Alternative
class Solution {
    public void rotate(int[] nums, int k) {
        int[] temp=new int[nums.length];
        for(int i =0;i<nums.length;i++){
            temp[(i+k)%nums.length]=nums[i];
        }
        for(int i = 0;i<nums.length;i++){
            nums[i]=temp[i];
        }
    }
}