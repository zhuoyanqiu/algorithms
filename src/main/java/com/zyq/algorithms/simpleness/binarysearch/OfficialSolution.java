package com.zyq.algorithms.simpleness.binarysearch;

/**
 * 官方代码
 */

public class OfficialSolution {

    public int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = (high - low) / 2 + low;
            int num = nums[mid];
            if (num == target) {
                return mid;
            } else if (num > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-1,0,3,5,9,12};
        int target = 9;
        OfficialSolution solution = new OfficialSolution();
        int search = solution.search(nums, target);
        System.out.println(search);
    }
}
