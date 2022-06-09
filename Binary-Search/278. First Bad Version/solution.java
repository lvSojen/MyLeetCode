// Link
// https://leetcode.com/submissions/detail/718428218/
public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 1, right = n;
        int mid =0;
        while (left <= right) {
            mid = left + (right - left) / 2; 
            if (isBadVersion(mid)) {
                right = --mid; 
            } else {
                left = ++mid; 
            }
        }
        return left;
    }
}
// Alternative
public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int lo = 1;
        int hi = n;
        int mid;
        while (lo < hi) {
            mid = (hi - lo) / 2 + lo;
            if (isBadVersion(mid)) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }
}