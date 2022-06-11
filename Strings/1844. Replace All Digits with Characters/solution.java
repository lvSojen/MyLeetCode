// Link
// https://leetcode.com/submissions/detail/719781086/
class Solution {
    public String replaceDigits(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length();i++) {
            char c = s.charAt(i);
            if(c <97) {
                char newC = (char) (c-48 +s.charAt(i-1));
                sb.append(newC);
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
// Alternative
class Solution {
    public String replaceDigits(String s) {
        char[] arr = s.toCharArray();
        for(int i = 1; i < arr.length; i += 2) {
            // shift the char using digit
            arr[i] = (char)(arr[i-1] + arr[i]-'0');
        }
        return String.valueOf(arr);
    }
}