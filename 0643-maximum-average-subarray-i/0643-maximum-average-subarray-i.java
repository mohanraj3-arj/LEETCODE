class Solution {
    public double findMaxAverage(int[] nums, int k) {

        double MaxAverage = Integer.MIN_VALUE;
        int sum = 0;

        double currentAverage = 0;

        for(int i = 0; i < k; i++){
            sum+=nums[i];
        }
       
        currentAverage = (double)sum / k;
        MaxAverage = currentAverage;

        for(int j = k; j < nums.length; j++){
            sum+=nums[j];
            sum-=nums[j-k];
            
            currentAverage = (double)sum / k;
            MaxAverage = Math.max(MaxAverage, currentAverage);
        }
        return MaxAverage;

        
    }
}