class Solution {
    public int maxSubArray(int[] nums) {
         int currentMax = nums[0];
         int GlobalMax = nums[0];

         for(int i = 1; i < nums.length; i++){
            currentMax = Math.max(nums[i], currentMax+nums[i]);
            GlobalMax = Math.max(currentMax, GlobalMax);
         }
         return GlobalMax;
    }
}