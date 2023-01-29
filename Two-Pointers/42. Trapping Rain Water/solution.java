class Solution {
    public int trap(int[] height) {
        int total=0;
        for(int i =0; i < height.length; i++) {
            total+= findWater(height,i);
        }
        return total;
    }
    public static int findWater(int[] height, int currentIndex) {
        int maxL =0, maxR =0;
        for(int i = currentIndex; i >=0; i--) {
            maxL = height[i] > maxL ? height[i] : maxL;
        }
        for(int i = currentIndex; i <height.length; i++) {
            maxR = height[i] > maxR ? height[i] : maxR;
        }
        // cotain water = min(max Left wall , max right wall) - current Height
        return maxR>maxL ? maxL-height[currentIndex] >0 ? maxL-height[currentIndex] : 0 : maxR-height[currentIndex] >0 ? maxR-height[currentIndex] : 0;

    }
}