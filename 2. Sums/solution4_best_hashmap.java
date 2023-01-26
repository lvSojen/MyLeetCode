class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        int restOfSum = 0;
        int ans[] = new int[2];
        for(int p1 = 0; p1 < nums.length; p1++) {
            restOfSum = target - nums[p1];
            if(hash.containsKey(nums[p1])) {
                ans[0] = p1;
                ans[1] = hash.get(nums[p1]);
                break;
            }
            hash.put(restOfSum,p1);
        }
        return ans;
    }
}