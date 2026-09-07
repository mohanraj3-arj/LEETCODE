class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int Minvalue = Integer.MAX_VALUE;
        int Mindiff = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length-2; i++){
            int left = i+1;
            int right = nums.length-1;
            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];

              
                if(sum == target) return sum;
                  int diff = Math.abs(target - sum);

                if(diff < Mindiff){
                    Minvalue = sum;
                    Mindiff = diff;
                }
                if(sum > target){
                    right--;
                }
               else if(sum < target) {
                    left++;
                }
            }
        }
        return Minvalue;
       
    }
}