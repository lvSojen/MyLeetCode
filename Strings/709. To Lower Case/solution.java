// Link
// https://leetcode.com/submissions/detail/718155847/
class Solution {
    public String toLowerCase(String s) {
        return s.toLowerCase();
    }
}
// Alternative
class Solution {
    public String toLowerCase(String str) {
        char[] a = str.toCharArray();
        for (int i = 0; i < a.length; i++)
            if ('A' <= a[i] && a[i] <= 'Z')
                a[i] = (char) (a[i] - 'A' + 'a');
        return new String(a);
}