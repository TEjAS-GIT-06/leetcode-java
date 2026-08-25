/*
 * LeetCode Problem: 350 - Intersection of Two Arrays II
 *
 * 1. Difficulty: Easy
 * 2. Pattern: Two Pointers / Sorting
 * 3. Time Complexity: O(n log n + m log m)
 * 4. Space Complexity: O(min(n, m))
 */

import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> ans = new  ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int st1 = 0;
        int st2 = 0;
        while(st1<nums1.length && st2<nums2.length) {
            if(nums1[st1]==nums2[st2]) {
                ans.add(nums1[st1]);
                st1++;
                st2++;
            }
            else if(nums1[st1]>nums2[st2]) {
                st2++;
            }
            else {
                st1++;
            }
        }
        
        int[] result = new int[ans.size()];

        for (int i = 0; i < ans.size(); i++) 
        {
            result[i] = ans.get(i);
        }
        return result;

        
    }
}