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


        int[] arr = new int[nums.length];
        int n = nums.length;
        int sumtotal = Arrays.stream(nums).sum();
        int sumbelow = 0;

        for(int i = 0; i < n; i++){
            int num = nums[i];
            sumtotal -= num;

            arr[i] = sumtotal - (n-i-1) * num + i * num - sumbelow;
            sumbelow += nums[i];
        }
        return arr;










    }
}