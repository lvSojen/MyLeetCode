// Link
// https://leetcode.com/submissions/detail/714282636/
class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int indexNumber=0;
        if(ruleKey.equals("type")) {
            indexNumber=0;
        } else if(ruleKey.equals("color")) {
            indexNumber=1;
        } else if(ruleKey.equals("name")) {
            indexNumber=2;
        }
            
        int count = 0;
        for (List<String> list : items) {
            if(list.get(indexNumber).equals(ruleValue)) {
                count ++;
            }
        }
        return count;
    }
}
// Alternative
class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int n = items.size();
        int ans = 0;
        int index = 0;
        
        if(ruleKey.equals("type")){
            index = 0;
        }
        if(ruleKey.equals("color")){
            index = 1;
        }
        if(ruleKey.equals("name")){
            index = 2;
        }
        
        for(int i = 0; i < n; i++){
            if(items.get(i).get(index).equals(ruleValue)){
                ans++;
            }
        }
        return ans;
    }
}
