/**
 * Question Link : https://leetcode.com/problems/median-of-two-sorted-arrays/submissions/
 */

public class median_of_two_sorted_arrays {

    class Solution {
        public double findMedianSortedArrays(int[] ar1, int[] ar2) {

            int i = 0, n=ar1.length, m=ar2.length;
            int j = 0;
            int count;
            int m1 = -1, m2 = -1;

            if ((m + n) % 2 == 1)
            {
                for(count = 0;
                    count <= (n + m) / 2;
                    count++)
                {
                    if (i != n && j != m)
                    {
                        m1 = (ar1[i] > ar2[j]) ?
                                ar2[j++] : ar1[i++];
                    }
                    else if (i < n)
                    {
                        m1 = ar1[i++];
                    }

                    else
                    {
                        m1 = ar2[j++];
                    }
                }
                return m1;
            }

            else
            {
                for(count = 0;
                    count <= (n + m) / 2;
                    count++)
                {
                    m2 = m1;
                    if (i != n && j != m)
                    {
                        m1 = (ar1[i] > ar2[j]) ?
                                ar2[j++] : ar1[i++];
                    }
                    else if (i < n)
                    {
                        m1 = ar1[i++];
                    }

                    // for case when j<m,
                    else
                    {
                        m1 = ar2[j++];
                    }
                }
                return (m1 + m2) / 2.0;
            }

        }
    }

}
