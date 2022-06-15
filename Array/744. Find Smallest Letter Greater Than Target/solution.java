// Link
// https://leetcode.com/submissions/detail/722441238/
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        for(char element :letters) {
            if(element > target) {
                return element;
            }
        }
        return letters[0];
    }
}
// Alternative
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (target < letters[mid]) 
                end = mid - 1;
            else
                start = mid + 1;
        }
        return letters[start % letters.length];
    }
}