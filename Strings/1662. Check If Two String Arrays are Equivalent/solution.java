// Link
// 
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String compare1 = "";
        for(String element : word1) {
            compare1+=element;
        }
        String compare2 = "";
        for(String element : word2) {
            compare2+=element;
        }
        return compare1.equals(compare2);
    }
}
// Alternative
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for(int i = 0; i<word1.length; i++){
            sb1.append(word1[i]); 
        }
        for(int i = 0; i<word2.length; i++){
            sb2.append(word2[i]); 
        }
        return (sb1.toString().equals(sb2.toString()));
    }
}