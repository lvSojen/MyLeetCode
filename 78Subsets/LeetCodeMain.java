package LeetCodes;

import java.util.List;

public class LeetCodeMain {

    public static void main(String[] args) {

        int[] example = new int[]{1, 2, 3};
        List <List<Integer>> result;
        Solution solution = new Solution();
        result = solution.subsets(example);
        System.out.println(result);
    }
}
