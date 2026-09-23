class Solution {
    public int searchInsert(int[] nums, int target) {
        // for(int i = 0; i <= nums.length-1; i++){
        //     if(nums[i] == target){
        //         return i;
        //     }
            
        // }
        // for(int j = 0; j <= nums.length-1; j++){
        //     if(nums[j] > target){
        //         return j;
        //     }
            
        // }
    
        // return nums.length;


    int right = nums.length-1;
    int left = 0;
    int ans = nums.length;
  
    while(left <= right){
        int mid = (left + right) / 2;

        if(nums[mid] == target){
           
            return mid;
        }
        if(nums[mid] < target){
            
            left = mid+1;
        }
        if(nums[mid] > target){
          ans = mid;
            right = mid-1;
        }
    }
   
        return ans;










    
        
        
        
    }
}