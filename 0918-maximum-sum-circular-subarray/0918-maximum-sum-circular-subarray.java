class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        
        int maxsum = nums[0];
        int minsum = nums[0];
        int glmin = nums[0];
        int ans = 0;
        int totalsum = 0;
        int glmax = nums[0];

        for(int i = 0; i < nums.length; i++){
            totalsum += nums[i];
        }

        for(int i = 1; i < nums.length; i++){

            minsum = Math.min(nums[i], minsum + nums[i]);
            glmin = Math.min(glmin, minsum);

            maxsum = Math.max(nums[i], nums[i] + maxsum);
            glmax = Math.max(glmax, maxsum);
        }
        if(glmax < 0){
            return glmax;
        }
        return Math.max(totalsum - glmin, glmax);

        
    }
}