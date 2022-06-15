// Link
// https://leetcode.com/submissions/detail/722427607/
class Solution {
    public int mySqrt(int x) {
        long l = 0;
        long r = x;
        long mid = 0;
        while(l<=r) {
            mid = l+ (r-l)/2;
            if(mid*mid > x){
                r = --mid;
            } else if(mid*mid < x) {
                l = ++mid;
            } else {
                return (int)mid;
            }
        }
        return (int)r;
    }
}
// Alternative
class Solution {
    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        int i = 1;
        int j = x;
        while (true) {
            int mid = i + (j - i) / 2;
            if (x / mid < mid) {
                j = mid - 1;
            } else if ((mid + 1) > x / (mid + 1)) {
                return mid;
            } else {
                i = mid + 1;
            }
        }
    }
}