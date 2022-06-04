// Link
// https://leetcode.com/submissions/detail/714485969/
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[2*n];
        for(int i = 0; i < n; i++){
           res[2 * i] = nums[i];
           res[2 * i + 1] = nums[n+i];
        }
        return res;
    }
}
// Alternative
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int size = nums.length - n;
    	
    	int[] split1 = Arrays.copyOfRange(nums, 0, size);
    	int[] split2 = Arrays.copyOfRange(nums, size, nums.length);
    	
    	int[] shuffleArray = new int[nums.length];
    	
    	for (int i = 0, j = 0; i < nums.length; i+=2, j++) {
			shuffleArray[i] = split1[j];
			shuffleArray[i+1] = split2[j];
		}
    	
		return shuffleArray;
    }
}