// Link
// https://leetcode.com/submissions/detail/715888597/
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] res = new int[nums.length];
        int count =0;
        for(int i =0; i<nums.length;i++) {
            int j =0;
            while(j <=nums.length-1){
                if(nums[j]<nums[i]) {
                    count ++;
                }
                j++;
            }
            res[i] = count;
            count =0;
        }
        return res;
    }
}
// Alternative
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {        
        int[] count = new int[101];
        
        for(int n: nums) {
            count[n]++;
        }
        
        for(int i = 1; i < 101; i++) { // running sum
            count[i] += count[i - 1];
        }
        
        int[] res = new int[nums.length];
        
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                res[i] = 0;
            } else {
                res[i] = count[nums[i] - 1];
            }
        }        
        return res;    
    }
}
// Alternative
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] ans = nums.clone();
        Arrays.sort(nums);
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i< n; i++)
            if(!map.containsKey(nums[i]))
                map.put(nums[i], i);
        //System.out.println(map);
        for(int i = 0; i<n; i++){
            ans[i] = map.get(ans[i]);
        }
        return ans;
    }
}