class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {

         //    int count = 0;
        //     int n = nums.length;
        // for(int i = 0; i < n; i++){
        //     int product = 1;
        //     for(int j = i; j < n; j++){
        //         product = product * nums[j];
        //          if(product < k){
        //             count++;
        //         }
        //         if(product >= k){
        //             break;
        //         }
                
                
        //     }
           
        // }
        // return count;


        int left = 0;
        int currentProduct = 1;
        int count = 0;
        if(k <= 0){
            return 0;
        }

        for(int i = 0; i < nums.length; i++){
            currentProduct *= nums[i];

            while( currentProduct >= k){

                currentProduct /= nums[left];

                left++;
            }

                count+=i - left + 1;;
            

        }
        return count;
                               
    }
}