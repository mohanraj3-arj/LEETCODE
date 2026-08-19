class Solution {
    public int findMaxLength(int[] nums) {
        // int maxlen = 0;

        // for(int i = 0; i < nums.length; i++){
        //     int zero = 0;
        //     int one = 0;

        //     for(int j = i; j < nums.length; j++){
        //         if(nums[j] == 1){
        //             one++;
        //         }
        //         else{
        //             zero++;
        //         }
        //         if(one == zero){
        //             if(maxlen < j-i+1){
        //                 maxlen = j-i+1;
        //             }

        //         }
        //     }
        // }
        // return maxlen;
        //**** Optimal Approach **** */


        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                nums[i] = -1;
            }
        }

        int sum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int maxlen = 0;

        map.put(0,-1);
        for(int i = 0; i < nums.length; i++){

            sum+=nums[i];

            if(map.containsKey(sum)){
                int len = map.get(sum);

                maxlen = Math.max(maxlen, i-len);
            }
            else{
                  map.put(sum, i);
            }
          


        }

    return maxlen;














    }
}