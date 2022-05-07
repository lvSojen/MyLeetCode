// Link
// https://leetcode.com/submissions/detail/694658895/
class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder stringBuilder = new StringBuilder();
        int index = 0;
        String res = "";
        boolean flag = true;
        Arrays.sort(strs, (a, b) - > Integer.compare(a.length(), b.length()));
        while (index < strs[0].length()) {
            stringBuilder.append(strs[0].charAt(index));
            for (int i = 0; i < strs.length; i++) {
                if (strs[i].charAt(index) != stringBuilder.charAt(index)) flag = false;
            }
            if (flag) {
                res = new String(stringBuilder);
                index++;
            } else {
                break;
            }
        }
        return res;
    }
}