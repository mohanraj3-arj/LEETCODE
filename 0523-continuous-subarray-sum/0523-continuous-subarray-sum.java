class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        // for(int i = 0; i < nums.length; i++){
        //     int sum = 0;
        //     for(int j = i; j < nums.length; j++){
        //         sum+=nums[j];
       //   int val = sum / k;
        //         if(j-i+1 >= 2 && sum % k == 0){
        //             return true;
        //         }
        //     }
        // }
        // return false;

        //**** Optimal Approach **** */



        int prefixsum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();

        map.put(0,-1);


        for(int i = 0; i < nums.length; i++){
            prefixsum+=nums[i];

            int reminder = prefixsum % k;

            if(map.containsKey(reminder)){
                if(i - map.get(reminder) >= 2){
                    return true;
                }
               
            }
            else{
                map.put(reminder, i);
            }
        }
        return false;





        
    }
}