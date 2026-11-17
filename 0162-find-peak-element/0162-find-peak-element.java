class Solution {
    public int findPeakElement(int[] nums) {
            int ans = 0;
            if(nums.length == 1){
                return 0;
            }
        if(FindSorted(nums)){
            return nums.length-1;
        }
        else
        for(int i = 1; i < nums.length-1; i++){
            
            if(nums[i] > nums[i-1] && nums[i]>nums[i+1]){
                ans = i;
            }
            
        }
        return ans;
        
    }
    public boolean FindSorted(int[] arr){
        for(int i = 1; i < arr.length; i++){
            if(arr[i-1] > arr[i]){
                return false;

            }
        }
        return true;
    }
}