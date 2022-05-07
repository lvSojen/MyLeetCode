package LeetCodes;
import java.util.ArrayList;
import java.util.List;

class Solution {

    List <List<Integer>> result = new ArrayList<>();
    List <Integer> subset = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        result.add(new ArrayList<>());
        dfs (nums,subset,result,0);
        return result;
    }

    public void dfs(int []nums, List<Integer>subset,List <List<Integer>> result,int startPoint){
        for (int i=startPoint;i<nums.length;i++){
            subset.add(nums[i]);
            result.add(new ArrayList<>(subset));
            dfs(nums,subset,result,i+1);
            // not sure why when subset at size 3, it then call remove function twice
            subset.remove(subset.size()-1);
        }
    }
}