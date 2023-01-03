/**

Link : https://leetcode.com/explore/featured/card/fun-with-arrays/525/inserting-items-into-an-array/3245/

*/

class Solution {
    public void duplicateZeros(int[] arr) {
        
        int n = arr.length;
        for(int i=0;i<n-1; ++i){
            if(arr[i] == 0){
                shiftRight(arr, ++i);
            }
        }
        
    }
    
    public void shiftRight(int[] a, int index){
        int n = a.length;
        for(int i=n-1; i>index; --i){
            a[i] = a[i-1];
        }
        a[index] = 0;
    }
}
