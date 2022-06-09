// Link
// https://leetcode.com/submissions/detail/718288996/
class Solution {
    public String truncateSentence(String s, int k) {
        String[] split = s.split(" ");
        String res = "";
        for(int i=0;i<k;i++) {
            res += split[i]+" ";
        }        
        return res.replaceAll(".$","");
    }
}
// Alternative
class Solution {
    public String truncateSentence(String s, int k) {
        String[] input =s.split(" ");
        String str =new String();
	    for(int i=0;i<k;i++)
	    {
	        str = str.concat(input[i]);
                    if(i!=k-1)
                    str=str.concat(" ");
	    }
        return str;
    }
}