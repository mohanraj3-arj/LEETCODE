class Solution {
    public int[] leftRightDifference(int[] nums) {
        
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];

        int leftSum = 0;
        int rightSum = 0;

        left[0] = 0;
        right[nums.length-1] = 0;

        for(int i = 1; i <= nums.length-1; i++){
            leftSum += nums[i-1];
            left[i] = leftSum;
        }
        for(int j = nums.length-2; j >= 0; j--){
            rightSum += nums[j+1];
            right[j] = rightSum;
        }

        for(int i = 0; i < nums.length; i++){
            if(right[i] == 0){
                nums[i] = left[i];
            }
            else if(left[i] == 0){
                nums[i] = right[i];
            }
            else{
                nums[i] = Math.abs(left[i] - right[i]);
            }
        }
        return nums;

    }
}