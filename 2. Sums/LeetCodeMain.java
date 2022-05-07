package LeetCodes;

import java.util.Scanner;
public class LeetCodeMain {
    //https://leetcode.com/submissions/detail/646520765/
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Size?");

        int size = scanner.nextInt();
        int []example = new int[size];
        for (int i =0;i<example.length;i++){
            int value = scanner.nextInt();
            example[i] = value;
        }
        System.out.println("Target?");
        int target = scanner.nextInt();
        int []temp =solution.twoSum(example,target);
        for (int i = 0; i < temp.length; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
