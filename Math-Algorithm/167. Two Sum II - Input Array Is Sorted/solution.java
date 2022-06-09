// Link
// https://leetcode.com/submissions/detail/718182851/
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for(int number : numbers) {
            map.put(number,++count);
        }
        int[] res = new int[2];
        count =0;
        for(int number : numbers) {
            count ++;
            if(map.containsKey(target-number)) {
                res[0] = count;
                res[1] = map.get(target-number);
                return res;
            }
        }
        return res;
    }
}
// Alternative
class Solution {
    public int[] twoSum(int[] numbers, int target) {

        for(int i =0,j=numbers.length-1;i<j;){
            int sum = numbers[i]+numbers[j];
            if(sum == target){
                return new int[]{i+1,j+1};
            }else if(sum>target){
                j--;
            }else if(sum<target){
                i++;
            }
        }
        return new int[2];
    }
}