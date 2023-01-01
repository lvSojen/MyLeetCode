/**
 * https://leetcode.com/problems/decode-the-message/submissions/868878040/
 *
 * Runtime
 * 5 ms
 * Beats
 * 88.63%
 * Memory
 * 42.4 MB
 */
class Solution {
    public String decodeMessage(String key, String message) {
        char[] charArray = key.toCharArray();
        int a = 97;
        HashMap<Character, Character> map = new HashMap<>();
        for (char elem : charArray) {
            if (elem != ' ' && !map.containsKey(elem)) {
                map.put(elem, (char) a++);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char elem : message.toCharArray()) {
            if (elem != ' ') {
                sb.append(map.get(elem));
            } else {
                sb.append(' ');
            }

        }
        return sb.toString();

    }
}