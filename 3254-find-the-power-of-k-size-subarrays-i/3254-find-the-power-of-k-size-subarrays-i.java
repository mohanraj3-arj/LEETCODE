class Solution {
    public int[] resultsArray(int[] nums, int k) {

    // ** brute force approach **

        // int n = nums.length;
        // int[] result = new int[n - k + 1];
        // Arrays.fill(result, -1);
        // if(nums.length == k && nums.length == 1){
        //     return nums;
        // }
        // if(k == 1){
        //     return nums;
        // }

        // for(int i = 0; i <= nums.length-k; i++){
        //     int max = i;
        //     boolean flag = true;
          
        //     for(int j = i; j < (i + k) - 1; j++){
        //         if(nums[j] > nums[j+1]){
        //             flag = false;
        //         }
        //         int diff = Math.abs(nums[j+1] - nums[j]);
        //         if(diff != 1){
        //             flag = false;
        //         }
        //         else{
                    
        //             max = j + 1;
                   
        //         }
                
        //     }
        //     if(flag){
        //         if(nums[max] != nums[i]){
        //             result[i] = nums[max];
        //         }

               
                
                
        //     }
        // }
        // return result;

    // **Optimal approach **




       
        int n = nums.length;
        int [] result = new int[n - k + 1];

        int consecutive  = 0;

        for(int i = 0; i < k-1; i++){
            if(nums[i] + 1 == nums[i+1]){
                consecutive++;
            }
        }

        if(consecutive == k - 1){
            result[0] = nums[k-1];

        }
        else{
            result[0] = -1;
        }
        for(int i = 1; i <= n - k; i++){
            if(nums[i] == nums[i-1] + 1){
                consecutive--;
            }
            if(nums[i + k - 1] == nums[i + k - 2] + 1){
                consecutive++;
            }
            if(consecutive == k - 1){
                result[i] = nums[i + k - 1];
            }
            else{
                result[i] = -1;
            }
        }

        
    return result;


    }
}