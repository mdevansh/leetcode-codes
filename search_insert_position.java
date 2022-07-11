/**
 * Question Link : https://leetcode.com/problems/search-insert-position/
 */

public class search_insert_position {

    class Solution {
        public int searchInsert(int[] nums, int target) {
            int low = 0, high = nums.length-1;
            while(low<high){
                int mid =  low + (high-low)/2;
                if(nums[mid] == target) return mid;
                else if(target < nums[mid] ){
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }
            if(nums.length == 1 && nums[0] == target) return 0;
            if(nums[0]>target) return 0;
            else if(nums[nums.length-1]<target) return nums.length;
            low = 0;
            high = nums.length-1;
            while(low<high){
                int mid =  low + (high-low)/2;
                if(nums[mid] > target && nums[mid-1] < target) return mid;
                else if(target < nums[mid] ){
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }
            return low;
        }
    }

}
