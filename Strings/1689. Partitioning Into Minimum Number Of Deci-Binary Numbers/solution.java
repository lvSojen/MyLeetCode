// Link:
// https://leetcode.com/submissions/detail/703103797/
class Solution {
    public int minPartitions(String n) {
        if(n.length()==1) return Character.getNumericValue(n.charAt(0));
        int max =0;
        int left =0;
        int right =n.length()-1;
        while(left <=right) {
            if(Character.getNumericValue(n.charAt(left))>max) {
                max = Character.getNumericValue(n.charAt(left));
            } 
            if (Character.getNumericValue(n.charAt(right))>max) {
                max = Character.getNumericValue(n.charAt(right));
            }
            left ++;
            right--;
        }
        return max;
    }
}
// Alternative
class Solution {
    public int minPartitions(String n) {
         for(int i=9;i>=0;i--){
              if(n.contains(String.valueOf(i))) return i;
          }
        return 0;
    }
}
// Alternative
class Solution {
    public int minPartitions(String n) {
        int max = 0;
        for(char ch: n.toCharArray()){
            max = Math.max(max,ch-'0');
        }
        return max;
    }
    
}
