class Solution {
    public int[] productExceptSelf(int[] nums) {
        

        // int prefix = 0;
        // int[] answer = new int[nums.length];
        // for(int i = 0; i < nums.length; i++){

        //     int product = 1;

        //     for(int j = 0; j < nums.length; j++){
        //         if(j != i){
        //             product *= nums[j];
        //         }
        //     }
        //     answer[i] = product;

        // }
        // return answer;


        //**** Optimal solutions *** */


        int zerocount = 0;
        int product = 1;
        int[] answer = new int[nums.length];
       

        for(int i = 0; i < nums.length; i++){
           if(nums[i] != 0){
            product *= nums[i];
           }
           else{
            zerocount++;
            
           }

           
            
        }
        for(int j = 0; j < nums.length; j++){
           if(zerocount > 1){
            answer[j] = 0;
           }
           else if(zerocount == 1){
            if(nums[j] == 0){
                answer[j] = product;
            }
            else{
                answer[j] = 0;
            }
           }
           else{
            answer[j] = product / nums[j];
           }
        }
        return answer;
        







    }
}