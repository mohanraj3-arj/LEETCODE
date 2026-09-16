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

       // ***************** Approach optimal *****************

       int currentmax = nums[0];
       int currentmin =nums[0];
       int globalmax = nums[0];
       int globalmin = nums[0];

       for(int i = 1; i < nums.length; i++){
        currentmax = Math.max(nums[i], currentmax + nums[i]);
        currentmin = Math.min(nums[i], currentmin + nums[i]);
        globalmax = Math.max(globalmax, currentmax);
        globalmin = Math.min(globalmin, currentmin);

       }
       return Math.max(Math.abs(globalmax), Math.abs(globalmin));
    }
}