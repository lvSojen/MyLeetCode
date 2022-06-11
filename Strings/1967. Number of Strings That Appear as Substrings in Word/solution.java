// Link
// https://leetcode.com/submissions/detail/719764317/
class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count =0;
        for (String element : patterns) {
            if(word.contains(element)) {
                count ++;
            }
        }
        return count;
    }
}
// Alternative
class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int length = patterns.length, count = 0;
            for(int i=0;i<length;i++){
                if(word.contains(patterns[i])){
                    count++;
                }
            }
        return count;
        
    }
}