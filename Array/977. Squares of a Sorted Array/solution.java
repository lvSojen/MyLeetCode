// Link
// https://leetcode.com/submissions/detail/718431281/
class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res = new int [nums.length];
        Map<Integer,Integer> map = new HashMap<>();
        for(int number : nums) {
            map.put(number*number, map.getOrDefault(number*number, 0)+ 1);
        }
        int count =0;
        for(Integer key :map.keySet()) {
            while(map.get(key)>0) {
                res[count++] =key;
                map.put(key,map.get(key)-1);
            }
        }
        Arrays.sort(res);
        return res;
    }
}
// Alternative
class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        int i=0, j=nums.length-1;
        for(int k=nums.length-1;k>=0;k--){
            if(Math.abs(nums[i])>Math.abs(nums[j])){
                res[k]=nums[i]*nums[i];
                i++;
            }else{
                 res[k]=nums[j]*nums[j];
                j--;
            }
        }
        return res;
    }
}