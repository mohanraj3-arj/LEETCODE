class Solution {
    public int maxProduct(int[] nums) {
        int maxProduct = 1;
       int max = Integer.MIN_VALUE;

       for(int i = 0; i < nums.length; i++){
        maxProduct *= nums[i];
        max = Math.max(maxProduct, max);
        if(nums[i] == 0){
            maxProduct = 1;
        }
       }
       maxProduct = 1;
       for(int i = nums.length - 1; i >= 0; i--){
        maxProduct *= nums[i];
        max = Math.max(maxProduct, max);
        if(nums[i] == 0){
            maxProduct = 1;
        }
       }

       return max;
    }
}