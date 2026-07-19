class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {

        // int SubCount = 0;
        // for(int i = 0; i < nums.length; i++){
        //     int sum = 0;
        //     for(int j = i; j < nums.length; j++){
        //         sum += nums[j];
        //         if(sum == goal){
        //             SubCount++;
        //         }
        //     }
        // }
        return atMost(nums, goal) - atMost(nums, goal-1);
       
    }
    public int atMost(int[] nums, int goal){
         int SubCount = 0;
        int left = 0;
        int sum = 0;
        if(goal < 0){
            return 0;
        }
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            while(sum > goal){
               
                    sum -= nums[left];
                
                left++;
                
            
            }
            
                SubCount+=(i - left + 1);
            
            
            
        }
        return SubCount;
        
    }
}