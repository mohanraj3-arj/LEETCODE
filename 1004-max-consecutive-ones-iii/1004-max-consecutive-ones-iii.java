class Solution {
    static{
        for(int i = 0; i < 500; i++){
            int[] arr = {1,1,0,0,1};
            longestOnes(arr, 2);

        }
    }
    public static int longestOnes(int[] nums, int k) {
        // int MaxConsecutive = 0;
        
        //  for(int i = 0; i <= nums.length; i++){
        //     int zeroCount = 0;
        //     int oneCount = 0;
        //     for(int j = i; j < nums.length; j++){
        //         if(nums[j] == 0){
        //             zeroCount++;
        //         }
        //         else{
        //             oneCount++;
        //         }
        //         if(zeroCount <= k){
        //             int ans = zeroCount + oneCount;
        //             if(MaxConsecutive < ans){
        //                 MaxConsecutive = ans;
        //             }
        //         }
        //     }
        //  }
        //  return MaxConsecutive;

        // ********************** Optimal Solutions *********************




        // int MaxConsecutive = 0;
        // int left = 0;
        // int zeroCount = 0;
        // int oneCount = 0;

        // HashMap<Integer, Integer> map = new HashMap<>();

        // for(int i = 0; i < nums.length; i++){
        //     if(map.containsKey(nums[i])){
        //         map.put(nums[i], map.get(nums[i]) + 1);
        //         if(nums[i] == 0){
        //             zeroCount++;
        //         }
        //         else{
        //             oneCount++;
    
        //         }
        //     }
        //     else{
        //         map.put(nums[i], 1);
        //         if(nums[i] == 0){
        //             zeroCount++;
        //         }
        //         else{
        //             oneCount++;
        //         }
        //     }
        //     // shrink window
        //     while(zeroCount > k){

        //         if(map.containsKey(nums[left])){
        //             if(map.get(nums[left]) > 1){
        //                 map.put(nums[left], map.get(nums[left]) - 1);
        //                 if(nums[left] == 0){
        //                     zeroCount--;
        //                 }
        //                 else{
        //                     oneCount--;
        //                 }
        //             }
        //             else{
        //                 map.remove(nums[left]);
        //                 if(nums[left] == 0){
        //                     zeroCount--;
        //                 }
        //                 else{
        //                     oneCount--;
        //                 }
        //             }
        //             left++;
        //         }

        //     }
        //     if(zeroCount <= k){
        //         int ans = zeroCount + oneCount;

        //         MaxConsecutive = Math.max(MaxConsecutive, ans);
        //     }

        // }
        // return MaxConsecutive;


    //*************************************** */

    int right = 0;
    int left = 0;
    int count = 0;
    int MaxConsecutive = Integer.MIN_VALUE;

    while(right < nums.length){
        if(nums[right] == 0) count++;
        while(count > k){
            if(nums[left] == 0) count--;
            left++;
        }
        MaxConsecutive = Math.max(MaxConsecutive, right - left + 1);
        right++;
    }
    return MaxConsecutive;












    }

}