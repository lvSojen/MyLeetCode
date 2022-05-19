// Link:
// https://leetcode.com/submissions/detail/703074218/
class Solution {
    public int mostWordsFound(String[] sentences) {
        int max =0;
        for(int i=0; i<sentences.length;i++) {
            String[] chArray = sentences[i].split(" ");
            if(chArray.length>max) {
                max = chArray.length;
            }
        }
        return max;
    }
}
// Alternative
class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        for(String sentence:sentences){
            String[] words = sentence.split(" ");
            if(words.length>max){
                max=words.length;
            }
        }
        
        return max;
    }
}