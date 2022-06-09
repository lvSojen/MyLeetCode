// Link
// https://leetcode.com/submissions/detail/718266647/
class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        
        while(left <=right) {
            int middle = left +(right -left)/2;
            if(nums[middle] == target) {
                return middle;
            } else if (nums[middle] > target) {
                right = --middle;
            } else if(nums[middle] < target) {
                left = ++middle;
            }
        }
        return -1;
    }
}
// Alternative
class Solution {
    public int search(int[] nums, int target) 
    {
        int l=0,r=nums.length-1;
        int mid=0;
        while(l<=r)
        {
            mid=l+(r-l)/2;
            if(nums[mid]==target) return mid;
            if(target<nums[mid]) r=mid-1;
            else l=mid+1;
        }
        return -1;
    }
}
// Alternative
class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int middle =0;
        while(left <=right) {
            middle = left +(right -left)/2;
            if(nums[middle] == target) {
                return middle;
            } else if (nums[middle] > target) {
                right = --middle;
            } else  {
                left = ++middle;
            }
        }
        return -1;
    }
}