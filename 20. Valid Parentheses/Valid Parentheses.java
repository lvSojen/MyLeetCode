// Link:
// https://leetcode.com/submissions/detail/696427937/
// Runtime: 2 ms, faster than 80.90% of java
// Memory Usage: 42.6 MB, less than 12.27% of Java 
class Solution {
    public static boolean isValid(String s) {
        if (!(s.length() % 2 == 0)) return false;
        Deque < Character > stack = new ArrayDeque < > ();
        int firstIndex = 0, lastIndex = s.length() - 1;
        char first = s.charAt(firstIndex), last = s.charAt(lastIndex);
        if (first == ')' | first == ']' | first == '}' || last == '(' | last == '[' | last == '{') {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ')' || s.charAt(i) == ']' || s.charAt(i) == '}') {
                char popCharacter = 0;
                try {
                    popCharacter = stack.pop();
                } catch (Exception e) {
                    return false;
                }
                if (popCharacter == '(' && (s.charAt(i) == ']' | s.charAt(i) == '}')) return false;
                else if (popCharacter == '[' && (s.charAt(i) == ')' | s.charAt(i) == '}')) return false;
                else if (popCharacter == '{' && (s.charAt(i) == ')' | s.charAt(i) == ']')) return false;
            } else {
                stack.push(s.charAt(i));
            }
        }
        return stack.isEmpty();
    }
}