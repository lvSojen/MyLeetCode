class Solution {
    public int trap(int[] height) {
        int totalWater =0, maxLeft=0, maxRight=0;
        // left and right pointer
        int leftPoint =0, rightPoint=height.length-1;
        // break while loop when two pointers touch each other
        while(leftPoint < rightPoint) {
            // if left wall is less than or equal to right wall
            //      move left ++
            // else
            //      move right --
            if(height[leftPoint] <= height[rightPoint]) {
                totalWater += getWater(height,maxLeft,leftPoint);
                // if currentHeight is greater than maxLeft, assign maxLeft with the new height
                maxLeft = height[leftPoint] > maxLeft ? height[leftPoint] : maxLeft;
                leftPoint++;
            } else {
                // if currentHeight is greater than maxLeft, assign maxRight with the new height
                totalWater += getWater(height,maxRight,rightPoint);
                maxRight = height[rightPoint] > maxRight ? height[rightPoint] : maxRight;
                rightPoint--;
            }
        }
        return totalWater;
    }
    // currentWater = min(maxLeft, maxRight) - currentHeight
    public static int getWater(int[] height, int maxHeight, int currentHeight) {
        return maxHeight - height[currentHeight] >0 ? maxHeight-height[currentHeight] : 0;
    }
    
}