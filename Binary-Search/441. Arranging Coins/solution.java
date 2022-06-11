// Link
// https://leetcode.com/submissions/detail/719729586/
class Solution {
    public int arrangeCoins(int n) {
        int start =1;
        int count =0;
        while(n>=0) {
            n -= start;
            if(n >=0) {
                count++;
            } else {
                break;
            }
            start ++;
        }
        return count;
    }
}
// Alternative
class Solution {
    public int arrangeCoins(int n) {
       long left =0;
        long right =n;
        long k ;
        long cur;
        while(left<=right){
             k = left +(right-left)/2;
         cur= k*(k+1)/2;
            if(cur==n)return (int)k;
            if(n<cur)right =k-1;
            else left = k+1;
        }
        
        return (int)right;
         
    }
}