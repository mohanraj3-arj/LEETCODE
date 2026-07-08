class Solution {
    public double findMaxAverage(int[] nums, int k) {

        
        int sum = 0;

        

        for(int i = 0; i < k; i++){
            sum+=nums[i];
        }
       
        
        int MaxAverage = sum;

        for(int j = k; j < nums.length; j++){
            sum = sum + nums[j] - nums[j-k];
            
            
            MaxAverage = Math.max(MaxAverage, sum);
        }
        return (double) MaxAverage/k;

        
    }
}