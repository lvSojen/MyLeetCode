// Link:
// https://leetcode.com/submissions/detail/703111112/
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for (Character cha: stones.toCharArray()) {
            if (jewels.contains(cha.toString())) {
                count++;
            }
        }
        return count;
    }
}
// Alternative
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int result = 0;
        for(char c :stones.toCharArray()){
            if(jewels.indexOf(c) != -1){
                result++;
            }
        }
        return result;
    }
}