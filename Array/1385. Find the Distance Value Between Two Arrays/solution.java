// Link
// https://leetcode.com/submissions/detail/722403874/
class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count = arr1.length;
        for(int i =0; i <arr1.length; i++) {
            for(int j =0; j<arr2.length; j++) {
                if(Math.abs(arr1[i]-arr2[j])<=d){
                    count--;
                    break;
                }
                
            }
            
        }
        return count;
    }
}
// Alternative
class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int c = 0;
        int lt = 0;
        for(int i=0;i<arr1.length;i++){
            lt = 0;
            for(int j=0;j<arr2.length;j++){
                if(Math.abs(arr1[i] - arr2[j])<=d){
                   lt = 1; 
                 break;  
                }
            }
            if(lt == 0){
                c++;
            }
        }
        return c;
    }
}