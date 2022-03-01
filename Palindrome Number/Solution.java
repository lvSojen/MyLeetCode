package LeetCodes;

class Solution {

    public boolean isPalindrome(int x) {
        String front = String.valueOf(x);
        String [] splited = front.split("");
        String back ="";
        for (int i =splited.length-1; i>=0;i--){
            back += String.valueOf(splited[i]);
        }
        if (front.equals(back)){
            return true;
        }
        return false;
    }
}