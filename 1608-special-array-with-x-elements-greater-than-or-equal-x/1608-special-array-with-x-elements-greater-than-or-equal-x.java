class Solution {
    public int specialArray(int[] nums) {
     
        for(int i = 0; i < nums.length; i++){
           int count = 0;
           int x = i+1;

           for(int j = 0; j < nums.length; j++){
                if(nums[j] >= x){
                    count++;
                }
               
               
               
           }
            if(count == x){
                    return x;
                }
               

          
        }
        return -1;
        
    }
}