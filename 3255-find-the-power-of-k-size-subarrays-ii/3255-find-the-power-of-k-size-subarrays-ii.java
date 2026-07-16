class Solution {
    public int[] resultsArray(int[] nums, int k) {

        // int consecutive = 0;
        // int n = nums.length;
        // int[] answer = new int[n - k + 1];

        // for(int i = 0; i < k-1; i++){
        //     if(nums[i+1] == nums[i]+1){
        //         consecutive++;
        //     }
        // }
        // if(consecutive == k - 1){
        //     answer[0] = nums[k-1];

        // }else{
        //     answer[0] = -1;
        // }
        // for(int i = 1; i <= n-k; i++){
        //     if(nums[i-1] + 1 == nums[i]){
        //         consecutive--;
        //     }
        //     if(nums[i + k - 1] == nums[i + k - 2] + 1){
        //         consecutive++;
        //     }
        //     if(consecutive == k - 1){
        //         answer[i] = nums[i + k - 1];
        //     }
        //     else{
        //         answer[i] = - 1;
        //     }
        // }
        // return answer;
        
    int n = nums.length;
     int consec = 1;

      int[]  result = new int[n - k + 1];
      Arrays.fill(result, -1);
      if(k == 1){
        return nums;
      }

      for(int i = 1; i < n; i++){
        if(nums[i - 1] + 1 != nums[i]){
            consec = 1;
        }
        else{
            consec++;
            if(consec >= k){
                result[i-k+1] = nums[i];
            }
        }
      }
     return result;

    }
}