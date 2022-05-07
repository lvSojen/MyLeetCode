package LeetCodes;

import java.util.Scanner;
public class LeetCodeMain {
    //https://leetcode.com/submissions/detail/650975328/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution solution = new Solution();
        System.out.print("x = ");
        int valueX = scanner.nextInt();
        System.out.println(solution.isPalindrome(valueX));
    }
}
