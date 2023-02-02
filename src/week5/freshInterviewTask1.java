package week5;
/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     * You can return the answer in any order.
     */

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * Example 1:
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */
public class freshInterviewTask1 {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15, 3, 6, 4, 5, 2, 7};
        int target = 9;

      /*  List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) continue;
                if (nums[i] + nums[j] == target && !result.contains(nums[i])) {
                    result.add(nums[i]);
                    result.add(nums[j]);
                }
            }

       */
        Set<Integer> result = new LinkedHashSet<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result.add(nums[i]);
                    result.add(nums[j]);
                }

            }

        }
        System.out.println(result);
    }
}
