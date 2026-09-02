class Solution {
    public int maxProduct(int[] nums) {
        int maxProduct = 0;
        if(nums.length == 1) return nums[0];

        for(int i = 0; i < nums.length; i++){
            int product = 1;
            for(int j = i; j < nums.length; j++){
                product *= nums[j];

                maxProduct = Math.max(maxProduct, product);
             }
        }
        return maxProduct;

       
    }
}