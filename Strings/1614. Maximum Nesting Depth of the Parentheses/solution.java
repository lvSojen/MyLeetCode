// Link
// https://leetcode.com/submissions/detail/715075318/
class Solution {
    public int maxDepth(String s) {
        int max= 0;
        int countValue =0;
        for(char element : s.toCharArray()) {
            if(element == '(') {
                countValue++;
            } else if (element == ')') {
                countValue--;
            }
            if(countValue>max) {
                max = countValue;
            }
        }
        return max;
    }
}
// Alternative
class Solution {
    public int maxDepth(String s) {
        //Stack<Character> st = new Stack<>();
        
        int maxDepth = 0;
        int count = 0;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '(') {
                count++;
                //st.push('(');
            } else if(s.charAt(i) == ')') {
                maxDepth = Math.max(maxDepth, count);
                count--;
                //st.pop();
            }
        }
        
        return maxDepth;
    }
}