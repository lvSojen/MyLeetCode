class Solution {
    public boolean isValid(String s) {
        if (s == "" || s.length() % 2 != 0) return false;
        Deque < Character > queue = new ArrayDeque < > ();
        Character dequeueVal = null;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                queue.push(s.charAt(i));
                continue;
            }
            try {
                dequeueVal = queue.pop();
            } catch (Exception e) {
                return false;
            }

            if ((dequeueVal == '{' && s.charAt(i) != '}') || (dequeueVal == '(' && s.charAt(i) != ')') || (dequeueVal == '[' && s.charAt(i) != ']')) {
                return false;
            }

        }
        return queue.isEmpty();
    }
}