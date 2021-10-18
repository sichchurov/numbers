package test;

import java.util.*;

public class Solution {


    public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

        int arrLength = scanner.nextInt();
        int[] nums = new int[arrLength];
        int[] tmp = new int[nums.length];
        for (int i = 0; i < arrLength; i++) {
            nums[i] = scanner.nextInt();
            tmp[i] = 1;
        }
        Arrays.sort(nums);
        int longestStreak = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    tmp[i] = Math.max(tmp[i], tmp[j] + 1);
                }
            }
            longestStreak = Math.max(tmp[i], longestStreak);
        }
        System.out.println(longestStreak);

        scanner.close();
    }
}
