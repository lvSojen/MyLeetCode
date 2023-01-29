class Solution {
    public int maxArea(int[] height) {
        int left =0, right = height.length-1, maxArea =0, minHeight=0, width=0;
        while(left < right) {
            
            minHeight = height[right] > height[left] ? height[left] : height[right];
            width = right - left;
            maxArea = minHeight*width > maxArea ? minHeight*width : maxArea;
            if(height[right] >= height[left]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}