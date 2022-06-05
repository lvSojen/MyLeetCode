// Link
// https://leetcode.com/submissions/detail/715067098/
class Solution {
    public int numberOfBeams(String[] bank) {
        ArrayList<Integer> list = new ArrayList<>();
        for(String inputString : bank) {
            int counts =0;
            for(char element : inputString.toCharArray()) {
                if(element == '1'){
                    counts++;
                }
            }
            if(counts >0){
                list.add(counts);
            }

        }
        if(list.size()<=1) {
            return 0;
        }
        int total =0;
        for(int i =0;i<list.size()-1;i++) {
            total += list.get(i) * list.get(i+1);
        }
        return total;
    }
}
// Alternative
class Solution {
    public int numberOfBeams(String[] bank) {
        int numberOfBeams = 0;
        int lastLaserCount = 0;
        for (int i = 0; i < bank.length; i++) {
            int currentLaserCount = getBitCount(bank[i]);
            if (currentLaserCount > 0) {
                numberOfBeams += lastLaserCount * currentLaserCount;
                lastLaserCount = currentLaserCount;
            }
        }
        return numberOfBeams;
    }
    
    public int getBitCount(String str) {
        int bitCount = 0;
        for (byte b: str.getBytes()) {
            bitCount += ((int) b) - 48;
        }
        return bitCount;
    }
}