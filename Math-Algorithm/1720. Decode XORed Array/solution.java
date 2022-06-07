// Link
// https://leetcode.com/submissions/detail/716628622/
class Solution {
    public int[] decode(int[] encoded, int first) {
        int[] res = new int[encoded.length+1];
        res[0] = first;
        for(int i=0;i<encoded.length;i++) {
            res[i+1] = res[i] ^ encoded[i];
        }
        return res;
    }
}
// Alternative
class Solution {
    public int[] decode(int[] encoded, int first) {
        int n = encoded.length + 1;
        int ans[] = new int[n];
        ans[0]= first;
        for (int i = 0; i < encoded.length; i++) {
            ans[i+1] = ans[i]^encoded[i];
        }
        return ans;
    }
}