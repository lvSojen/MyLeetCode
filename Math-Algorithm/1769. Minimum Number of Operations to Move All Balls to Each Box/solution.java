// Link
// https://leetcode.com/submissions/detail/716899633/
class Solution {
    public int[] minOperations(String boxes) {
        int[] res = new int[boxes.length()];
        List<Integer> list = new ArrayList<>();
        for(int i =0; i<boxes.length();i++) {
            if (boxes.charAt(i) == '1') {
                list.add(i);
            }
        }
        int index =0;
        int total;
        while(index <res.length) {
            total =0;
            for(Integer key : list) {
                total +=Math.abs(key-index);
            }
            
            res[index++] =total;
        }
        return res;
    }
}
// Alternative
class Solution {
    public int[] minOperations(String boxes) {
        int[] answer = new int[boxes.length()];

        // do a pass from the left
        int numBallsLeft = 0;
        int distLeft = 0;
        
        for (int i = 0; i < answer.length; i ++) {
            answer[i] = distLeft;
            if (boxes.charAt(i) == '1') {
                numBallsLeft ++;
            }
            distLeft += numBallsLeft;
        }
        
        // do a pass from the right;
        int numBallsRight = 0;
        int distRight = 0;
        
        for (int i = answer.length - 1; i >= 0; i --) {
            answer[i] += distRight;
            if (boxes.charAt(i) == '1') {
                numBallsRight ++;
            }
            distRight += numBallsRight;
        }
        
        return answer;
    }
}
// Alternative
class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        
        int[] ans = new int[n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (boxes.charAt(j) == '1') {
                    ans[i] += Math.abs(j - i);
                }
            }
        }
        return ans;
    }
}