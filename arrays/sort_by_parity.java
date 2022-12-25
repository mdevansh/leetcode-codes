package arrays;

/**
 * Link : https://leetcode.com/problems/sort-array-by-parity/submissions/865378584/
 */
public class sort_by_parity {

    class Solution {
        public int[] sortArrayByParity(int[] nums) {

            int count = 0;
            int n = nums.length;
            int[] arr = new int[n];

            for (int i = 0; i < n; ++i) {
                if (nums[i] % 2 == 0) {
                    arr[count] = nums[i];
                    ++count;
                }
            }
            for (int i = 0; i < n; ++i) {
                if (nums[i] % 2 != 0) {
                    arr[count] = nums[i];
                    ++count;
                }
            }
            return arr;
        }
    }

}
