class Solution {
    public int maxAbsoluteSum(int[] nums) {
        // int maxABS = Integer.MIN_VALUE;


        // for(int i = 0; i < nums.length; i++){
        //     int sum = 0;
        //     for(int j = i; j < nums.length; j++){
        //         sum += nums[j];
        //         maxABS = Math.max(maxABS, Math.abs(sum));
        //     }
            
        // }
        // return maxABS;

        int MaxAns = Integer.MIN_VALUE;

        int MinSum = nums[0];
        int MaxSum = nums[0];
        int CurrentMinSum = nums[0];
        int CurrentMaxSum = nums[0];

        if(nums.length == 1){
            return Math.abs(nums[0]);
        }

        for(int i = 1; i < nums.length; i++){
            CurrentMinSum = Math.min(nums[i], CurrentMinSum + nums[i]);
            CurrentMaxSum = Math.max(nums[i], CurrentMaxSum + nums[i]);

            MinSum = Math.min(MinSum, CurrentMinSum);
            MaxSum = Math.max(MaxSum, CurrentMaxSum);

            MaxAns = Math.max(Math.abs(MinSum), Math.abs(MaxSum));
        }
        return MaxAns;
    }
}