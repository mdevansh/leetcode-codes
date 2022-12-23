package arrays;

/**
 *
 * Link : https://leetcode.com/explore/learn/card/fun-with-arrays/511/in-place-operations/3259/
 */

public class replace_elements_with_greatest_element_on_right_side {

    class Solution {
        public int[] replaceElements(int[] arr) {


            int n = arr.length;
            if (n == 1) {
                arr[0] = -1;
                return arr;
            }

            int max = arr[n - 1];
            for (int i = n - 2; i >= 0; --i) {

                int temp = arr[i];

                arr[i] = max;
                if (temp > max) {
                    max = temp;
                }
                arr[n - 1] = -1;

            }
            return arr;
        }
    }
}
