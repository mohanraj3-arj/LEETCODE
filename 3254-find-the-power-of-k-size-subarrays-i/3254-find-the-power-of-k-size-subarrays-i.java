class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[n - k + 1];
        Arrays.fill(result, -1);
        if(nums.length == k && nums.length == 1){
            return nums;
        }
        if(k == 1){
            return nums;
        }

        for(int i = 0; i <= nums.length-k; i++){
            int max = i;
            boolean flag = true;
          
            for(int j = i; j < (i + k) - 1; j++){
                if(nums[j] > nums[j+1]){
                    flag = false;
                }
                int diff = Math.abs(nums[j+1] - nums[j]);
                if(diff != 1){
                    flag = false;
                }
                else{
                    
                    max = j + 1;
                   
                }
                
            }
            if(flag){
                if(nums[max] != nums[i]){
                    result[i] = nums[max];
                }

               
                
                
            }
        }
        return result;
        
    }
}