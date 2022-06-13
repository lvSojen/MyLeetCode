// Link
// https://leetcode.com/submissions/detail/721539306/
class Solution {
    public int findNumbers(int[] nums) {
        int count =0;
        for(int num : nums) {
            if((num+"").length()%2==0) count++;
        }
        return count;
    }
}
// Alternative
class Solution {
    public int findNumbers(int[] nums) {
        int dig;
        int count=0;
        for(int num:nums){
            dig=0;
            for(int j=num;j>0;j/=10){
                dig++;
            }
            if(dig%2==0)
                count++;
        }
        return count;
    }
}