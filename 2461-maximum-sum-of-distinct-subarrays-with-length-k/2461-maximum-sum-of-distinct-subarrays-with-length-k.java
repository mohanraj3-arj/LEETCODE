class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        // int maxsum = 0;
        // Set<Integer> set = new HashSet<>();
       
        
        // for(int i = 0; i <= nums.length-k; i++){
        //    int sum = 0;
        //    set.clear();
        //     for(int j = i; j < i+k; j++){
        //         if(!set.contains(nums[j])){
        //             set.add(nums[j]);
        //             sum += nums[j];
                    
        //         }
                
        //         else{
        //             sum=0;
        //         }
        //     }
        //    if(set.size() == k){
        //     maxsum = Math.max(maxsum, sum);
        //    }
                
            
        // }
        // long result = maxsum;
        // return result;


        // optimal approach

        long maxsum = 0;
        long sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < k; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], 1);
                sum+=nums[i];
            }
            else{
                int temp = map.get(nums[i]);
                map.put(nums[i], temp+1);
            }
        }
        if(map.size() == k){
            maxsum = sum;
        }
        for(int j = k; j < nums.length; j++){
            if(map.get(nums[j-k]) > 1){
                int temp = map.get(nums[j-k]);
                map.put(nums[j-k], temp-1);
            }
            else{
                sum-=nums[j-k];
                map.remove(nums[j-k]);
            }

            if(map.containsKey(nums[j])){
                int temp = map.get(nums[j]);
                map.put(nums[j], temp+1);
            }
            else{
                map.put(nums[j], 1);
               
                    sum+=nums[j];
                
                
            }

            if(map.size() == k){
                maxsum = Math.max(maxsum, sum);
            }
        }
        
      
        return maxsum;
        
    }
}