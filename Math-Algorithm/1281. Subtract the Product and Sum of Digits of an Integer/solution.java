// Link
// https://leetcode.com/submissions/detail/715877923/
class Solution {
    public int subtractProductAndSum(int n) {
        if(n ==0) return 0;
        int product = 1;
        int sum =0;
        for(char element :(""+n).toCharArray()) {
            product *= element - '0';
            sum += element - '0';
        }
        return product-sum;
    }
}
// Alternative
class Solution {
    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        
        while(n != 0){
            int digit = n % 10;
            n /= 10;
            
            product *= digit;
            sum += digit;
        }
        
        return (product - sum);
    }
}