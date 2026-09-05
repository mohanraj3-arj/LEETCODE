class Solution {
    public int thirdMax(int[] nums) {
        long firstmax = Long.MIN_VALUE;
        long secondmax = Long.MIN_VALUE;
        long thirdmax = Long.MIN_VALUE;
        if(nums.length < 3){
            Arrays.sort(nums);
            return nums[nums.length-1];
        }
        else{
        for(int num : nums){
            if(num == firstmax || num == secondmax || num == thirdmax) continue;
            if(num > firstmax){
                thirdmax = secondmax;
                secondmax = firstmax;
                firstmax = num;
            }
            else if(num > secondmax){
                thirdmax = secondmax;
                secondmax = num;
            }
            else if(num > thirdmax){
               
                thirdmax = num;
                
                
            }
        }
        }
        if(thirdmax == Long.MIN_VALUE){
            return (int) firstmax;
        }
        else{
            return (int) thirdmax;
        }
    }
}