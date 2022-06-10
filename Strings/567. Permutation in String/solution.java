// Link
// https://leetcode.com/submissions/detail/719133900/
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        StringBuilder sb = new StringBuilder(s1);
        String perm = sb.reverse().toString();
        if (s2.indexOf(perm) >=0 || s2.indexOf(s1) >=0 ) {
            return true;
        }
        Map <Character, Integer> map = new HashMap<>();
        for(char element : s1.toCharArray()) {
            map.put(element, map.getOrDefault(element, 0)+ 1);
        }
        for(int i =0;i<=s2.length()-s1.length();i++) {
            if(checkContains(map, s2.substring(i,i+s1.length()))) {
                return true;
            }
        }
        return false;
    }
    public boolean checkContains(Map<Character,Integer> map, String s2) {
        Map<Character,Integer> OldMap = new HashMap<>(map);
        for (char element : s2.toCharArray()) {
            if(OldMap.containsKey(element)) {
                if(OldMap.get(element)==1) {
                    OldMap.remove(element);
                } else {
                    OldMap.put(element,OldMap.get(element)-1);
                }
            } else {
                return false;
            }
        }
        return true;
    }
}
// Alternative
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;
        
        int[] map1 = new int[26];
        int[] map2 = new int[26];
        
        for(int i = 0; i < s1.length(); i ++){
            map1[s1.charAt(i) - 'a']++;
            map2[s2.charAt(i) - 'a']++;
        }
        
        for(int i = 0; i < s2.length() - s1.length(); i++){
            
            if(match(map1, map2)) return true;
            map2[s2.charAt(i) - 'a']--;
            map2[s2.charAt(i + s1.length()) - 'a']++;
            
        }
        return (match(map1, map2));
        
    }
    private boolean match(int[] s1, int[] s2){
        for(int i = 0; i < 26; i++){
            if(s1[i] != s2[i]) return false;
        }
        return true;
    }
}