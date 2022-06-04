// Link
// https://leetcode.com/submissions/detail/714384281/
class Solution {
    public int[] executeInstructions(int n, int[] startPos, String s) {
        int[] ChangingPos = startPos.clone();
        int[] result = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            ChangingPos = startPos.clone();
            int count = 0;
            for (int j = i; j < s.length(); j++) {
                if (!afterPos(ChangingPos, s.charAt(j), n)) {
                    break;
                } else {
                    count++;
                }
            }
            result[i] = count;
        }
        return result;
    }

    public static Boolean afterPos(int[] startPos, char element, int board) {
        int x_axis = startPos[0];
        int y_axis = startPos[1];
        if (element == 'R' && y_axis+1 < board) {
            y_axis += 1;
        } else if (element == 'L' && y_axis-1 >0 ) {
            y_axis -= 1;
        } else if (element == 'U' && x_axis-1 >0) {
            x_axis -= 1;
        } else if (element == 'D' && x_axis+1 <board) {
            x_axis += 1;
        } else {
        	return false;
        }
        startPos[0] = x_axis;
        startPos[1] = y_axis;
        return true;
    }
}
// Alternative
class Solution {
    // R->c+1;
    // L->c-1;
    // U->r-1;
    // D->r+1;
    public int[] executeInstructions(int n, int[] startPos, String s) {
        
        char[] moves = s.toCharArray();
        int l = moves.length;
        int[] res=new int[l];
        for(int i=0;i<l;i++)
        {
            int r = startPos[0];
            int c = startPos[1];
            int val = 0;
            for(int j=i;j<l;j++)
            {
                char ch = moves[j];
                if(ch=='R' && c+1<n){
                    c++;
                    val++;
                }
                else if(ch=='L' && c-1>=0){
                    c--;
                    val++;
                }
                else if(ch=='U' && r-1>=0){
                    r--;
                    val++;
                }
                else if(ch=='D' && r+1<n)
                {
                    r++;
                    val++;
                }
                else
                    break;    
            
            }
            res[i]=val;
            
        }
        return res;
    }
}