package leetCode75;

/**
 * Question Link : https://leetcode.com/problems/running-sum-of-1d-array/submissions/
 */

public class running_sum_of_1D_array {
    class Solution {
        public int[] runningSum(int[] nums) {
            int n = nums.length;
            int sum = 0;
            for(int i=0;i<n;++i){
                sum+=nums[i];
                nums[i]=sum;
            }
            return nums;
        }
    }
}
