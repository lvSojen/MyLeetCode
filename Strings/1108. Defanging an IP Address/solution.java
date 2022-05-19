// Link:
// https://leetcode.com/submissions/detail/703070757/
class Solution {
    public static String defangIPaddr(String address) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i=0;i<address.length();i++) {
            if(address.charAt(i) =='.') {
                stringBuilder.append("[.]");
            } else {
                stringBuilder.append(address.charAt(i));
            }

        }
        return stringBuilder.toString();
    }
}
// Alternative
class Solution {
    public String defangIPaddr(String address) {
        
           return     address.replace(".","[.]");
    }
}