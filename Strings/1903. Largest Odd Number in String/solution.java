// Link:
// https://leetcode.com/submissions/detail/702943335/
class Solution {
    public String largestOddNumber(String num) {
        int count =num.length();
        for (int i = num.length()-1; i >=0; i--) {
            if(Character.getNumericValue(num.charAt(i))%2!=0) {
                break;
            } else {
                count--;
            }
        }
        return num.substring(0,count);
    }
}

// Alternative
class Solution {
    public String largestOddNumber(String num) {
        
        for(int i=num.length()-1; i>=0; i--) {
            
            if((num.charAt(i) - '0') % 2 == 1) {
                
                return num.substring(0,i+1);
                
            }
            
        }
        
        return "";
    }
}