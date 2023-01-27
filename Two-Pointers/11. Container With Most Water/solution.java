class Solution {
    public int maxArea(int[] height) {
        int l = 0, r = height.length-1, max =0, newArea = 0;
        while(l < r) {
            max = getArea(l,r,height,max);
            if(height[r] >= height[l]) {
                l ++;
            } else {
                r --;
            }

        }
        return max;
    }
    public static int getArea(int l, int r, int[] height, int max) {
        int leftHeight = height[l];
        int rightHeight = height[r];
        return rightHeight >= leftHeight ? leftHeight * (r-l) > max ? leftHeight * (r-l) : max : rightHeight * (r-l) > max ? rightHeight * (r-l) : max;
    }
}