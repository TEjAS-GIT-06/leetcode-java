/*
 * LeetCode Problem: 2161 - Partition Array According to Given Pivot
 *
 * 1. Difficulty: Easy
 * 2. Pattern: Array Partitioning / Three-Way Partition
 * 3. Time Complexity: O(n)
 * 4. Space Complexity: O(n)
 */
class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int [] ans = new int[nums.length];
        int low = 0;
        int mid = 0;
        int high = nums.length;
        for(int val : nums) {
            if(val > pivot) {
                high--;
            }
            else if(val < pivot) {
                mid++;
            }
        }
        for(int val : nums) {
            if(val<pivot) {
                ans[low] = val;
                low++;
            }
            else if(val>pivot) {
                ans[high] = val;
                high++;
            }
            else {
                ans[mid] = val;
                mid++;
            }
        }
        int index = 0;
        for(int val : ans) {
            nums[index++] = val;
        }
        return nums;

    }
}