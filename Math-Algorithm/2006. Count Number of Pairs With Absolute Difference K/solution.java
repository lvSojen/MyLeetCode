// Link
// https://leetcode.com/submissions/detail/717469040/
class Solution {
    public int countKDifference(int[] nums, int k) {
        int res = 0;
        for(int i =0;i<nums.length-1;i++) {
            for(int j=i+1;j<nums.length;j++) {
                if(Math.abs(nums[i]-nums[j]) == k) {
                    res ++;
                }
            }
        }
        return res;
    }
}
// Alternative
class Solution {
    public int countKDifference(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int res = 0;
        
        for(int i = 0;i< nums.length;i++){
            if(map.containsKey(nums[i]-k)){
                res+= map.get(nums[i]-k);
            }
            if(map.containsKey(nums[i]+k)){
                res+= map.get(nums[i]+k);
            }
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        
        
        return res;
    }
}
// Alternative
class Solution {
    public int countKDifference(int[] nums, int k) {
       int count[]=new int[101];
      int kMax=100;
        int ans=0;
        for(int n:nums)
           count[n]++;

    for (int i = k + 1; i <= kMax; ++i)
      ans += count[i] * count[i - k];
        return ans;
    }
}