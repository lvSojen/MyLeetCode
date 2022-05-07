// Link:
// https://leetcode.com/submissions/detail/694549616/
class Solution {
    List<List<Integer>> ans= new ArrayList<List<Integer>>();
    List<Integer> temp = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        helper(candidates,0,target);
        return ans;
    }
    
    public void helper(int[] candidates, int indexId,int target) {
        if(target == 0) {
            ans.add(new ArrayList<Integer> (temp));
            return;
        }
        
        for (int i = indexId; i< candidates.length; i++){
            if(candidates[i]>target) break;
            
            temp.add(candidates[i]);
            helper(candidates,i,target-candidates[i]);
            temp.remove(temp.size()-1);
        }
    }
}
