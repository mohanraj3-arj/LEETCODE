class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        // int SubCount= 0;
        // HashMap<Integer, Integer> map = new HashMap<>();

        // for(int i = 0; i < nums.length; i++){
        //    int uniqueCount = 0;
        //    map.clear();



        //     for(int j = i;  j < nums.length; j++){
        //         if(!map.containsKey(nums[j])){
        //             map.put(nums[j], 1);
        //             uniqueCount++;
        //         }
        //         else{
        //             map.put(nums[j], map.get(nums[j]) + 1);
        //         }

        //         if(uniqueCount == k){
        //             SubCount++;

        //         }

        //     }
        // }
        // return SubCount;

        // *** Optimal Solutions ***





    return AtMost(nums, k) - AtMost(nums, k - 1);









        
    }
    private int AtMost(int[] nums, int k){
        
        int left = 0;
        int uniqueCount = 0;
        int result = 0;
        HashMap<Integer, Integer> map = new HashMap<>();


        for(int right = 0; right < nums.length; right++){

            if(!map.containsKey(nums[right])){
                map.put(nums[right], 1);
                uniqueCount++;
            }else{
                map.put(nums[right], map.get(nums[right]) + 1);
            }

            // shrink window

            while( uniqueCount > k){
                 if(map.containsKey(nums[left])){
                    if(map.get(nums[left]) == 1){
                        uniqueCount--;
                        map.remove(nums[left]);
                    }
                    else{
                        map.put(nums[left], map.get(nums[left]) - 1);
                       
                    }
                    left++;
                }
            }
           
                 result += right - left + 1;
            
           
        }
        return result;


    }
}