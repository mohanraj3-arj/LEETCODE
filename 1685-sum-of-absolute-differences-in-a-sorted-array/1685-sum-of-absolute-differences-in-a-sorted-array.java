class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        

        // int[] arr = new int[nums.length];

        // for(int i = 0; i < nums.length; i++){
        //     int sum = 0;
        //     for(int j = 0; j < nums.length; j++){
        //         int add = Math.abs(nums[i] - nums[j]);
        //         sum += add;
        //     }
        //     arr[i] = sum;
        // }
        // return arr;

        // *** Optimal Solutions ***


        int[] result = new int[nums.length];
        int n = nums.length;
        int sumtotal = 0;
       
        int rightsum = 0;

        for(int num : nums){
            sumtotal += num;
        }

    long leftSum = 0;
        for(int i = 0; i < nums.length; i++){
            long rightSum = sumtotal - leftSum - nums[i];

            long left = (long) i * nums[i] - leftSum;

            long right = rightSum - (long) (n-1-i) * nums[i];

            result[i] = (int) (left + right);

            leftSum += nums[i];

        }
        return result;










    }
}