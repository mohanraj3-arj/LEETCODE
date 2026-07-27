class Solution {
    public long countSubarrays(int[] nums, long k) {


        // long NumSub = 0;
        // for(int i = 0; i < nums.length; i++){
        //     int sum = 0;
        //     int len = 0;
        //     for(int j = i; j < nums.length; j++){
        //         sum+=nums[j];
        //         len++;
        //         int product = sum * len;
        //         if(product < k){
        //             NumSub++;
        //         }
        //     }
        // }
        // return NumSub;

        //** Optimal Solutions *** */



        long NumSub = 0;
        long sum = 0;
    
        int left = 0;
        
      

        for(int i = 0; i < nums.length; i++){

           

            sum+=nums[i];
            int len = i - left + 1;

        //   long product = (long)sum * len;

            while((long) sum * (i - left + 1) >= k){
                sum -= nums[left];
                 left++;
               

            }
            
                NumSub += i - left + 1;
            

            
        }
        return NumSub;











    }
}