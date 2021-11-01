package com.zyq.algorithms.simpleness.binarysearch;

/**
 * 二分查找
 */

public class Solution {
    public int search(int[] nums, int target) {
        return getResult(nums, target, 0, nums.length);
    }

    private int getResult(int[] nums, int target, int start, int end) {
        int center = getCenter(start, end);
        if (nums[center] == target) {
            return center;
        }
        if (start == end || end - start == 1) {
            return -1;
        }
        if (nums[center] > target) {
            return getResult(nums, target, start, center);
        }
        if (nums[center] < target) {
            return getResult(nums, target, center, end);
        }
        return -1;
    }

    private int getCenter(int start, int end) {
        int count = end - start;
        int center = count / 2 + start;
        return center;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-1,0,3,5,9,12};
        int target = 9;
        Solution solution = new Solution();
        int search = solution.search(nums, target);
        System.out.println(search);
    }

}