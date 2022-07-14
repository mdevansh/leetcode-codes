import java.util.Arrays;

/**
 * Question Link : https://leetcode.com/problems/squares-of-a-sorted-array/
 */

public class squares_of_a_sorted_array {

    class Solution {
        public int[] sortedSquares(int[] nums) {
            for(int i=0; i<nums.length; ++i){
                nums[i]*=nums[i];
            }
            Arrays.sort(nums);
            return nums;
        }
    }
}
