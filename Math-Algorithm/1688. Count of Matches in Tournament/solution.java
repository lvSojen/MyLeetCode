// Link
// https://leetcode.com/submissions/detail/717462337/
class Solution {
    public int numberOfMatches(int n) {
        int res = 0;
        while(n !=1) {
            int mathes = n/2;
            n -= mathes;
            res += mathes;
        }
        return res;
        
    }
}
// Alternative
class Solution {
    public int numberOfMatches(int n) {
        int matches = 0;
        while(n>=2) {
            if(n == (n/2)*2) {
                matches+=n/2;
                n/=2;
            }
            else {
                matches+=(n-1)/2;
                n=((n-1)/2)+1;
            }
        }
        return matches;
    }
}