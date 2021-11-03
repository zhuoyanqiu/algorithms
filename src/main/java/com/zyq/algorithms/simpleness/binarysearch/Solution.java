package com.zyq.algorithms.simpleness.binarysearch;

/**
 * 二分查找
 */

public class Solution {
    public int search(int[] nums, int target) {
        return getResult(nums, target, 0, nums.length - 1);
    }

    private int getResult(int[] nums, int target, int left, int right) {
        int mid = left + (right - left) / 2;
        if (left > right) {
            return -1;
        }else if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] < target) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
        return getResult(nums, target, left, right);

    }


    public static void main(String[] args) {
        int[] nums = new int[]{-1, 0, 3, 5, 9, 12};
        int target = 9;
        Solution solution = new Solution();
        int search = solution.search(nums, target);
        System.out.println(search);
    }

}