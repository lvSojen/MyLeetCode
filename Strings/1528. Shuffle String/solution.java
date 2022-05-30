// Link:
// https://leetcode.com/submissions/detail/710173667/
class Solution {
    public String restoreString(String s, int[] indices) {
        char[] charArray = new char[s.length()];
        int count =0;
        for(char element :s.toCharArray()) {
            charArray[indices[count++]]=element;
        }
        return String.valueOf(charArray);
    }
}
// Alternative
class Solution {
    public String restoreString(String s, int[] indices) {
        int n=s.length();
        char[] c=new char[n];
        for(int i=0;i<n;i++){
            c[indices[i]]=s.charAt(i);
        }
        return String.valueOf(c);
    }
}

