class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int Minval = Integer.MAX_VALUE;
        int answer = 0;
          for(int i = 0; i < nums.length-2; i++){
            for(int j = i+1; j < nums.length-1; j++){
               for(int k = j+1; k < nums.length; k++){
                int sum = nums[i] + nums[j] + nums[k];

                 int diff = Math.abs(sum - target);

                 if(Minval > diff){
                    Minval = diff;
                    answer = sum;
                 }



               }


               

            }
          
          }
          return answer;
    }
}