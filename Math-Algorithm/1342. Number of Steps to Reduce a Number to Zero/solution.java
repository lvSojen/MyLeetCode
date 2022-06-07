// Link
// https://leetcode.com/submissions/detail/716603011/
class Solution {
    public int numberOfSteps(int num) {
        int count =0;
        return findCount(num,count);
    }
    public int findCount(int num,int count) {
        while(num !=0) {
            if(num%2==0) {
                num /=2;
                count ++;
            } else {
                num -=1;
                count ++;
            }
        }
        return count;
    }
}
// Alternative
class Solution {
    public int numberOfSteps(int num) {
        // even - div 2 
        // odd - minu 1
        
        //14
        
        int count = 0;  //6
        while(num>0){
            count++;
            if(num%2==0){
                num = num/2;
            }else{
                num = num-1;
            }
        }
        return count;
    }
}