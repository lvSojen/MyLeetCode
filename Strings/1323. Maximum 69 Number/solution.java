// Link
// https://leetcode.com/submissions/detail/721530088/
class Solution {
    public int maximum69Number (int num) {
        char[] res = (num+"").toCharArray();
        if(!new String(res).contains("6")) return num;
        int count =0;
        for(char element : res) {
            if(element == 54) {
                res[count] = '9';
                return Integer.parseInt(new String(res));
            }
            count++;
        }
        return num;
    }
    
}
// Alternative
class Solution {
    public int maximum69Number (int num) {
        StringBuilder sb = new StringBuilder();
        sb.append(num);
        String s = sb.toString();        
        char[] ch = s.toCharArray();
        int len = ch.length;
        //int numOfChange = 0;
        for(int i=0;i<len;i++){
                if(ch[i] == '6'){
                    ch[i] = '9';
                    break;
                }            
        }
        String str = String.valueOf(ch);
        int number = Integer.parseInt(str);
        return number;
    }
}