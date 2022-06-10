// Link
// https://leetcode.com/submissions/detail/719011806/
class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet <>();
        int i =0, j=0, max=0, size = s.length();
        while(j<size) {
            if(!(set.contains(s.charAt(j)))){
                set.add(s.charAt(j++));
                max = Math.max(set.size(), max);
            } else {
                set.remove(s.charAt(i++));
            }
        }
        return max;
    }
}
// Alternative
// Link
// https://leetcode.com/problems/longest-substring-without-repeating-characters/discuss/2132830/Visual-Explanation-or-Sliding-Window-JAVA
public int lengthOfLongestSubstring(String s) {
	int n = s.length(), longest = 0;
	int[] nextIndex = new int[128]; 

	for (int r=0, l=0; r<n; r++) {
		l = Math.max(nextIndex[s.charAt(r)], l); 
		longest = Math.max(longest, r - l + 1);
		nextIndex[s.charAt(r)] = r + 1;
	}

	return longest;
}