class Solution {
    public int search(int[] nums, int target) {
        // for(int i=0; i<=nums.length-1; i++){
        //     if(nums[i] == target){
        //         return i;
        //     }
        // }
        // return -1;

        int left = 0;
        int right = nums.length-1;

        if(nums.length < 2){
            if(target == nums[0]){
                return 0;
            }
            else{
                return-1;
            }
        }

        while(left <= right){
            int mid = left + (right - left) / 2;

            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] > target){
                right = mid-1;
            }
            else if(nums[mid] < target){
                left = mid+1;
            }
        }
        return -1;


        
    }
}