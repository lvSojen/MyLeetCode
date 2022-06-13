// Link
// https://leetcode.com/submissions/detail/721510432/
class Solution {
    public String firstPalindrome(String[] words) {
        for(String s :words) {
            if(isPalin(s)) {
                return s;
            }
        }
        return "";
    }
    public boolean isPalin(String s) {
        StringBuilder sb = new StringBuilder(s);
        if(sb.reverse().toString().equals(s)) {
            return true;
        }
        return false;
    }
}
// Alternative
class Solution {
    public String firstPalindrome(String[] words) {
        String palindromeStr = "";
        
        for(int i = 0; i < words.length; i++) {
            String currentWord = words[i];
            if(isPalindrome(currentWord)) {
                palindromeStr = currentWord;
                break;
            }
        }
        
        return palindromeStr;
    }
    
    public boolean isPalindrome(String word) {
        int start = 0, end = word.length() - 1;
        while(start < end) {
            char startChar = word.charAt(start);
            char endChar = word.charAt(end);
            if(startChar != endChar) {
                return false;
            }
            start++;
            end--;
        }
        
        return true;
    }
}