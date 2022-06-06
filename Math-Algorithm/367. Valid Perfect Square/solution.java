// Link
// https://leetcode.com/submissions/detail/715785039/
class Solution {
    public boolean isPerfectSquare(int num) {
        if(num == 1) {
            return true;
        } else if (num <1 || num ==2147483647) {
            return false;
        } 
        int validSquareRoot = 2;
        int validSquare = 0;
        while(true) {
            validSquare = validSquareRoot * validSquareRoot;
            if(validSquare == num) {
                return true;
            } else if(validSquare > num) {
                return false;
            }
            validSquareRoot++;
        }
    }
}
// Alternative
class Solution {
    public boolean isPerfectSquare(int num) {
        
        int l=1,r=num,m=0;
        while(l<=r){
            m=l+(r-l)/2;
            if(m<(num/m)) l=m+1;
            else r=m-1;
        }
        if(l*l==num) return true;
        return false;
    }
}