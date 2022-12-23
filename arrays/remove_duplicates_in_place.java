package arrays;


/**
 *
 * Link : https://leetcode.com/explore/learn/card/fun-with-arrays/511/in-place-operations/3258/
 */
public class remove_duplicates_in_place {

    class Solution {
        public int removeDuplicates(int[] nums) {

            int n = nums.length;

            int count = 1;

            int t = nums[0];

            for (int i = 1; i < n; ++i) {

                if (nums[i] != t) {

                    t = nums[i];
                    nums[count] = t;
                    ++count;
                }
            }
            return count;

        }
    }

}
