// Link
// https://leetcode.com/submissions/detail/721545387/
class Solution {
    public boolean divideArray(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : nums) {
            map.put(num, map.getOrDefault(num,0)+1);
        }
        int count =0;
        for(Integer key :map.keySet()) {
            if(map.get(key)%2!=0) return false;
        }
        return true;
    }
}
// Alternative
class Solution {
    public boolean divideArray(int[] nums) {
        int[] count = new int[501];
        for (int num : nums) {
            count[num]++;
        }
        
        for (int i=0; i<= 500;i++) {
            if (count[i] % 2 != 0) {
                return false;
            }
        }
        
        return true;
    }
}