// Link
// https://leetcode.com/submissions/detail/720839094/
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : nums) {
            if(map.containsKey(num)){
                return true;
            }
            map.put(num,num);
        }
        return false;
    }
}
// Alternative
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer>mp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
           if(!mp.containsKey(nums[i])){
               mp.put(nums[i],1);
           } else {
               return true;
           }
        }
        return false;
    }
}