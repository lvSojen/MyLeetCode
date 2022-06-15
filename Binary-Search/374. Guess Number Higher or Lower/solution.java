// Link
// https://leetcode.com/submissions/detail/722394255/
public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int l = 1;
        int r = n;
        int mid = 0;
        while(l<=r) {
            mid = l+(r-l)/2;
            if(guess(mid)==0) {
                return mid;
            } else if(guess(mid) == -1) {
                r = --mid;
            } else {
                l = ++mid;
            }
        }
        return -1;
    }
}
// Alternative
public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int start = 1;
        int end = n;
        int mid = 1;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (guess(mid) == 0) {
                break;
            } else if (guess(mid) == -1)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return mid;
    }
}