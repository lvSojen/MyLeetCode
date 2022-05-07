// Link:
// https://leetcode.com/submissions/detail/694634135/
class Solution {
    HashMap < String, Integer > hashMap = new HashMap < > ();
    public int romanToInt(String s) {
        hashMap.put("I", 1);
        hashMap.put("V", 5);
        hashMap.put("X", 10);
        hashMap.put("L", 50);
        hashMap.put("C", 100);
        hashMap.put("D", 500);
        hashMap.put("M", 1000);
        hashMap.put("CM", 900);
        hashMap.put("CD", 400);
        hashMap.put("XC", 90);
        hashMap.put("XL", 40);
        hashMap.put("IV", 4);
        hashMap.put("IX", 9);
        int value = 0, total = 0;
        for (int i = 0; i < s.length(); i++) {
            if ((i + 1) != s.length()) {
                String twoLetters = String.valueOf(s.charAt(i)) + String.valueOf(s.charAt(i + 1));
                System.out.println(twoLetters);
                System.out.println(hashMap.get(twoLetters));
                if (hashMap.containsKey(twoLetters)) {
                    value = hashMap.get(twoLetters);
                    i += 1;
                } else {
                    value = hashMap.get(String.valueOf(s.charAt(i)));
                }
            } else {
                value = hashMap.get(String.valueOf(s.charAt(i)));
            }
            total += value;
        }
        return total;
    }
}