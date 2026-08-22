class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        // int count=0;
        // for(int i = 0; i < nums.length; i++){
        //     int sum = 0;
        //     for(int j = i; j < nums.length; j++){
        //         sum+=nums[j];
        //         if(sum%k == 0){
        //             count++;
        //         }
        //     }
        // }
        // return count;

        // optimal approach

         Map<Integer, Integer> map = new HashMap<>();
         int count = 0;

         int prefix = 0;
         map.put(0,1);  
         for(int num:nums){
            prefix += num;
            int rem = ((prefix % k) + k) % k;
            count+= map.getOrDefault(rem, 0);
            map.merge(rem,1, Integer::sum);

         }

    return count;

    }
}