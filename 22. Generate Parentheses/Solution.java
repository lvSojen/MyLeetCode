// Link:
// https://leetcode.com/submissions/detail/696544081/
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> output_arr = new ArrayList<>();
        backtrack(output_arr, "",0,0,n);
        return output_arr;
    }
    
    public void backtrack(List<String> output_arr, String current_String, int openN, int closeN, int N) {
        if(current_String.length() == N*2) {
            output_arr.add(current_String);
        }

        if(openN < N) backtrack(output_arr,current_String+ "(",openN+1,closeN,N);
        if(closeN < openN) backtrack(output_arr,current_String + ")",openN,closeN+1,N);

    }
}