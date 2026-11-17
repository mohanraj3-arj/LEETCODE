class Solution {
    public int findPeakElement(int[] nums) {
        //     int ans = 0;
        //     if(nums.length == 1){
        //         return 0;
     
     
        //     }

        //     for(int i = 0; i < nums.length; i++){
        //         if(i == 0 && nums[i] > nums[i+1]){
        //             return 0;
        //         }
        //         else if(i == nums.length-1){
        //             return nums.length-1;
        //         }
        //         else{
        //             if(nums[i]>nums[i+1] && nums[i] > nums[i-1]){
        //                 return i;
        //             }
        //         }
        //     }
        //    return -1;

        //************** Optimal Approach ************ */


        int left = 0; 
        int right = nums.length-1;
      
        while(left < right){
            int mid = left + (right - left) / 2;

            if(nums[mid] < nums[mid + 1]){
                
                left = mid+1;
            }
            else{
               
                right = mid;
            }
        }
        return right;












    }
}