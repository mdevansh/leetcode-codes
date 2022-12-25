package arrays;

/**
 * Link : https://leetcode.com/explore/learn/card/fun-with-arrays/511/in-place-operations/3157/
 */
public class move_zeroes {

    class Solution {
        public void moveZeroes(int[] nums) {

            int n = nums.length;
            int fp = 0;
            int lp = 1;

            while (lp < n) {

                if (nums[fp] == 0) {
                    if (nums[lp] != 0) {
                        nums[fp] = nums[fp] + nums[lp];
                        nums[lp] = nums[fp] - nums[lp];
                        nums[fp] = nums[fp] - nums[lp];
                        ++fp;

                    }
                    ++lp;
                } else {
                    ++fp;
                    ++lp;
                }

            }

        }

    }

}
