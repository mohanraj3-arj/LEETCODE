class Solution {
    public boolean search(int[] nums, int target) {
    
       int left = 0;
       int right = nums.length-1;

       Arrays.sort(nums);

       while(left <= right){
        int mid = (left + right) / 2;

        if(nums[mid] == target){
            return true;
        }
        if(target > nums[mid]){
            left = mid+1;
        }
        if(target < nums[mid]){
            right = mid-1;
        }
       }
        return false;
    }
}