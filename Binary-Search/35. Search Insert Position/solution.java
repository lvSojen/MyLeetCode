// Link
// https://leetcode.com/submissions/detail/715108609/
class Solution {
    public int searchInsert(int[] nums, int target) {
        int left =0;
        int right =nums.length;
        if(nums[0] > target) {
            return 0;
        } else if (nums[nums.length-1]<target) {
            return nums.length;
        }
        while(left<=right) {
            int middle = left+(right-left) /2;
            if(target<nums[middle]){
                right = middle-1;
            } else if (target >nums[middle]) {
                left = middle +1;
            } else {
                return middle;
            }
        }
        return nums[left] > target ? left  : left +1;
    }
}
// Alternative
class Solution {
    public int searchInsert(int[] nums, int target) {
        int start =0 ;
        int end = nums.length-1;
        int mid=-1;
        while (start<=end) {
            mid = start + (end-start)/2;
           if (nums[mid]==target) {
             return mid;  
            }
            else if (nums[mid]>target){
                end = mid-1;
                
            }
            else {
                  start = mid+1;
                
            }
            
        }
        
        if (nums[mid]!=target) {
            return end+1;
        }
        return mid;
    }
}