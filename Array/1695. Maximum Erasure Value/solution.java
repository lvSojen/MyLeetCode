// Link
// https://leetcode.com/submissions/detail/720920310/
class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        Set<Integer> set =  new HashSet();
        int sum =0, ans =0;
        int j = 0, i=0;
        while(j<nums.length){
            if(!set.contains(nums[j])){
                sum+=nums[j];
                ans = Math.max(sum,ans);
                set.add(nums[j++]);
            } else {
                sum = sum-nums[i];
                set.remove(nums[i++]);
            }
        }
        return ans;
    }
}
// Alternative
 public int maximumUniqueSubarray(int[] a){
        Set<Integer> s = new HashSet<>();
        int sum = 0, r = 0;
        for(int lo = 0, hi = 0; hi < a.length; )
            if(s.add(a[hi])){
                sum += a[hi++];
                r = Math.max(sum, r);
            }else{
                sum -= a[lo];
                s.remove(a[lo++]);
            }
        return r;
    }