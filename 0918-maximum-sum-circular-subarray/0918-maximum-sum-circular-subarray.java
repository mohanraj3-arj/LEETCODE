class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int TotalSum = 0;

        int MinSum = nums[0];
        int CurrentSum = nums[0];
        int MaxSum = nums[0];
        int CurrentMaxSum = nums[0];
        if(nums.length == 1){
            return nums[0];
        }

        for(int num : nums){
            TotalSum += num;
        }
        for(int i = 1; i < nums.length; i++){
            CurrentSum = Math.min(nums[i], CurrentSum + nums[i]);
            CurrentMaxSum = Math.max(nums[i], CurrentMaxSum + nums[i]);
            MinSum = Math.min(MinSum, CurrentSum);
            MaxSum = Math.max(CurrentMaxSum, MaxSum);
        }
        if(MaxSum < 0){
             return MaxSum;
        }
        return Math.max(MaxSum, TotalSum - MinSum);



    }
}