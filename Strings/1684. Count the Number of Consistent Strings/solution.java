// Link
// https://leetcode.com/submissions/detail/715099273/
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int total =words.length;
        for(String input : words) {
            for(char element : input.toCharArray()) {
                if( !(allowed.contains(""+element))){
                    total --;
                    break;
                }
            }
        }
        return total;
    }
}
// Alternative
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
       int [] allowSet=new int[128];
        int count =0;
        for(int i=0;i<allowed.length();i++){
            allowSet[allowed.charAt(i)]++;
        }
        
        for(String word:words){
            boolean isAllowed=true;
            for(int i=0; i<word.length();i++){
                if(allowSet[word.charAt(i)]==0){
                    isAllowed=false;
                    break;
                }
            }
            if(isAllowed){
                count++;
            }
        }
      
        return count;
    }
}