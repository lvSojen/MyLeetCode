// Link:
// https://leetcode.com/submissions/detail/696954332/
class Solution {
    List < Integer > temp = new ArrayList < > ();
    List < List < Integer >> res = new ArrayList < > ();
    public List < List < Integer >> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        helper(candidates, 0, target, temp, res);
        return res;
    }

    public void helper(int[] candidates, int startIndex, int target, List < Integer > temp, List < List < Integer >> res) {
        if (target == 0) {
            res.add(new ArrayList < Integer > (temp));
            return;
        }

        for (int i = startIndex; i < candidates.length; i++) {
            int num = candidates[i];
            if (num > target) return;
            if (i > startIndex && candidates[i] == candidates[i - 1]) continue;
            temp.add(num);
            helper(candidates, i + 1, target - num, temp, res);
            temp.remove(temp.size() - 1);
        }
    }
}