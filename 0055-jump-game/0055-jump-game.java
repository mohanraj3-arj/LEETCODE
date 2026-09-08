class Solution {
    public boolean canJump(int[] nums) {
        int start = 0;

        if(nums.length == 1){
            return true;
           
        }
    
        // while(start < nums.length-1){

        //     if(start < nums.length-1){
        //         start += nums[start];
        //     } 

        //     if(start >= nums.length-1){
        //         return true;
        //     }
        //     //  if(start < nums.length-1 && start  == nums.length-2){
        //     //     return false;
        //     // }

        //     if(nums[start] == 0 && start < nums.length-1){
        //         return false;
        //     }
        // }
        // return true;



        //************* ********************* */

        int fast = 0;
        for(int i = 0; i < nums.length; i++){
            if(i > fast){
                return false;
            }
            fast = Math.max(fast, i + nums[i]);
            if(fast >= nums.length-1){
                return true;
            }
        }
        return true;








    }
}