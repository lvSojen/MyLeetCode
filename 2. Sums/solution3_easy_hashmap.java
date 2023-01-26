class Solution {
    public int[] twoSum(int[] nums, int target) {
        int index=0,resetofSum = 0;
        int ans[] = new int[2];
        HashMap<Integer, Integer> hash = new HashMap<>();
        for(int elem : nums) {
            hash.put(elem,index++);
        }
        for(int i =0; i<nums.length; i++){
            resetofSum = target- nums[i];
            if(hash.containsKey(resetofSum) && hash.get(resetofSum) != i) {
                ans[0] =i;
                ans[1] =hash.get(resetofSum);
            }
        }
        return ans;
    }
}