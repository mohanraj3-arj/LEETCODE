class Solution {
    public int numberOfSubarrays(int[] nums, int k) {

        //  int Subcount = 0;

        //  for(int i = 0; i < nums.length; i++){
        //     int Oddcount = 0;
        //     for(int j = i; j < nums.length; j++){
        //         if(nums[j] % 2 == 1){
        //             Oddcount++;
        //         }
        //         if(Oddcount == k){
        //             Subcount++;
        //         }
        //     }
        //  }
        //  return Subcount;
        return atmost(nums, k) - atmost(nums, k-1);

    }
     
    
    public int atmost(int[] nums, int k){
        
        int Subcount = 0;
        int Oddcount = 0;
        int left = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 1){
                Oddcount++;
            }
            while(Oddcount > k){
                if(nums[left] % 2 == 1){
                    Oddcount--;
                   
                } 
                left++;
                
            }
            Subcount += (i - left + 1);
            
        }
        return Subcount;

    }
}