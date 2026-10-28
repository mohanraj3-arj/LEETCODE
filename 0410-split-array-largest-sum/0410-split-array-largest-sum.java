class Solution {
    public int splitArray(int[] nums, int k) {
        int min = Integer.MIN_VALUE;
        int max = 0;

        int n = nums.length;

        if(n < k){
            return 0;
        }
        for(int val : nums){
            min = Math.max(min, val);
            max += val;
        }
        int solution = 0;

        while(min <= max){
            int mid = min + (max - min) / 2;

            if(canfit(nums, mid, k)){
                solution = mid;
                max = mid-1;
            }
            else{
                min = mid+1;
            }
        }
        return solution;
    }
    public boolean canfit(int[] arr, int mid, int k){
        int count = 1;
        int sum = 0;

        for(int val : arr){
            if((sum + val) > mid){
                count++;
                 sum = val;
            }
            else{
                sum += val;
            }
            
        }
        return count <= k;
    }
}