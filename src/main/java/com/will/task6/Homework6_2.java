package com.will.task6;

/**
 * You are given an array of integers nums. Return the length of the longest subarray of nums which is either
 * strictly increasing or strictly decreasing.
 * <p>
 * Example 1:
 * Input: nums = [1,4,3,3,2]
 * Output: 2
 * Explanation:
 * The strictly increasing subarrays of nums are [1], [2], [3], [3], [4], and [1,4].
 * The strictly decreasing subarrays of nums are [1], [2], [3], [3], [4], [3,2], and [4,3].
 * Hence, we return 2.
 * <p>
 * Example 2:
 * Input: nums = [3,3,3,3]
 * Output: 1
 * Explanation:
 * The strictly increasing subarrays of nums are [3], [3], [3], and [3].
 * The strictly decreasing subarrays of nums are [3], [3], [3], and [3].
 * Hence, we return 1.
 * <p>
 * Example 3:
 * Input: nums = [3,2,1]
 * Output: 3
 * Explanation:
 * The strictly increasing subarrays of nums are [3], [2], and [1].
 * The strictly decreasing subarrays of nums are [3], [2], [1], [3,2], [2,1], and [3,2,1].
 * Hence, we return 3.
 * <p>
 * Constraints:
 * 1 <= nums.length <= 50
 * 1 <= nums[i] <= 50
 */

public class Homework6_2 {

    public int longestMonotonicSubarray(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }

        int maxLength = 1;
        int curLength = 1;

        boolean increasing = false;
        boolean decreasing = false;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                if (decreasing) {
                    maxLength = Math.max(maxLength, curLength);
                    curLength = 2;
                } else {
                    curLength++;
                }
                increasing = true;
                decreasing = false;
            } else if (nums[i] < nums[i - 1]) {
                if (increasing) {
                    maxLength = Math.max(maxLength, curLength);
                    curLength = 2;
                } else {
                    curLength++;
                }
                decreasing = true;
                increasing = false;
            } else {
                maxLength = Math.max(maxLength, curLength);
                curLength = 1;
                increasing = false;
                decreasing = false;
            }
        }

        maxLength = Math.max(maxLength, curLength);

        return maxLength;
    }
}
