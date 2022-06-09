// Link
// 
class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26) return false;
        Set<Character> set = new HashSet<>();
        for(char element :sentence.toCharArray()) {
            set.add(element);
        }
        return set.size() ==26;
    }
}
// Alternative
class Solution {
    public boolean checkIfPangram(String sentence) {
       for(int ind='a'; ind<='z'; ind++){
        if(sentence.indexOf(ind)<0){
            return false;
        }
    }
    return true;
    }
}
// Alternative
class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] letters = new int[26];
        
        for(int i = 0; i < sentence.length(); i++) {
            letters[sentence.charAt(i) - 'a']++;
        }
        
        for(int i = 0; i < letters.length; i++) {
            if(letters[i] == 0) {
                return false;
            }
        }
        return true;
    }
}