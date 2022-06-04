class Solution {
    public int maximumWealth(int[][] accounts) {
        int max =0;
        for(int[] list :accounts) {
            int total =0;
            for(int element : list) {
                total += element;
            }
            max = Math.max(max,total);
        }
        return max;
    }
}