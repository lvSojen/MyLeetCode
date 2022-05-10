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
// Better
class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 == 1) return false;
        
        Stack<Character> stack = new Stack();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else {
                // now we have a right parenthes (finally!), it should be the same as the one on the top stack, otherwise ...
                if (stack.isEmpty() || stack.pop() != c) {
                    return false;
                }
            }
        }
        
        // stack should be empty, otherwise if any "rights" left, it's bad!
        return stack.isEmpty();
    }
}
