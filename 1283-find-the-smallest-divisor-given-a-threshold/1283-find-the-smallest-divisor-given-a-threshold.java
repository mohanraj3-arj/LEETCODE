class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        // int max = nums[0];
        // for(int i = 1; i < nums.length; i++){
        //         if(max < nums[i]){
        //             max = nums[i];
        //         }
        // }
           
        //    int left = 1;
        //    int right = max;

        //    while(left <= right){
        //         int ans = 0;
        //         for(int val : nums){
        //             ans += (int)Math.ceil((double)val / left);
        //         }
        //         if(ans <= threshold){
        //             return left;
        //         }
        //         left++;
        //    } 
        //    return -1;

        Arrays.sort(nums);
        int right = nums[nums.length-1];
        int left = 1;
        int ans = -1;

        while(left <= right){
            int mid = (left + right) / 2;
          
               
                if(dividesum(nums, mid) <= threshold){
                    ans = mid;
                    right = mid-1;
                }
                else{
                    left  = mid+1;
                }
                

            
           
        }
         return ans;
    }
    public int dividesum(int[] arr, int mid){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
                sum += (int)Math.ceil((double)arr[i] / mid);
        }
        return sum;
    }

}