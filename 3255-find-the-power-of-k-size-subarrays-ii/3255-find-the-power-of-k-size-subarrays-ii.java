class Solution {
    public int[] resultsArray(int[] nums, int k) {

        int consecutive = 0;
        int n = nums.length;
        int[] answer = new int[n - k + 1];

        for(int i = 0; i < k-1; i++){
            if(nums[i+1] == nums[i]+1){
                consecutive++;
            }
        }
        if(consecutive == k - 1){
            answer[0] = nums[k-1];

        }else{
            answer[0] = -1;
        }
        for(int i = 1; i <= n-k; i++){
            if(nums[i-1] + 1 == nums[i]){
                consecutive--;
            }
            if(nums[i + k - 1] == nums[i + k - 2] + 1){
                consecutive++;
            }
            if(consecutive == k - 1){
                answer[i] = nums[i + k - 1];
            }
            else{
                answer[i] = - 1;
            }
        }
        return answer;
        
    }
}