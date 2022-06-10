// Link
// https://leetcode.com/submissions/detail/719164693/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] answer= new int[2];
        for (int i =0;i<nums.length-1;i++){
            for (int j =i+1; j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    answer[0]=i;
                    answer[1]=j;
                }
            }
        }
        return answer;
    }
}
// Alternative
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        int count =0;
        for(int number : nums) {
            map.put(number,count++);
        }
        int[] res = new int[2];
        count =0;
        for(int number : nums) {
            if(map.containsKey(target-number) && map.get(target-number)!=count) {
                res[0] = count;
                res[1] = map.get(target-number);
                break;
            }
            count++;
        }
        return res;
    }
}