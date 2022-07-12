/**
 * Question Link : https://leetcode.com/problems/max-consecutive-ones/
 */

public class max_consecutive_ones {

    class Solution {
        public int findMaxConsecutiveOnes(int[] nums) {
            int consecutive = 0,max = 0;
            for(int i=0; i<nums.length; ++i){
                if(nums[i]==1)  ++consecutive;
                else if(nums[i]==0)        {if(consecutive>max)max=consecutive;consecutive=0;}
            }
            // max=consecutive;
            if(consecutive>max)        max=consecutive;
            return max;
        }

    }


}
