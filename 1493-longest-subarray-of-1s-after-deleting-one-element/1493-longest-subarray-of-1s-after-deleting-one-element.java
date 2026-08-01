class Solution {
    public int longestSubarray(int[] nums) {
    //     int result = Integer.MIN_VALUE;

    //     for(int i = 0; i <= nums.length; i++){
    //         int zeros = 0;
    //         int ones = 0;

    //         for(int j = i; j < nums.length; j++){
               
    //             if(nums[j] == 0){
    //                 zeros++;
    //             }
    //             if(nums[j] == 1 && zeros <= 1){
    //                 ones++;
                   
    //            }
    //            result = Math.max(result, ones);
    //         }
    //         if(zeros == nums.length) return 0;
    //        if(ones == nums.length)  return ones - 1;
          
    //     }
    //     return result;
        // **Optimal Solutions **

int left = 0;
int maxones = Integer.MIN_VALUE;
int zero = 0;
    for(int right = 0; right < nums.length; right++){

        if(nums[right] == 0){
            zero++;
        }
        while(zero > 1){
            if(nums[left] == 0){
                zero--;
            }
            left++;
        }
        int ans = right - left + 1;
        ans -= zero;
        maxones = Math.max(maxones, ans);

    }
    if(zero == 0 ) return nums.length - 1;
    return maxones;

    }
}