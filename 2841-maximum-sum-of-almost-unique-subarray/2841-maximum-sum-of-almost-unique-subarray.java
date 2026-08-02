class Solution {
    public long maxSum(List<Integer> nums, int m, int k) {

        // HashMap<Integer, Integer> map = new HashMap<>();
        // long result = 0;
        // for(int i = 0; i <= nums.size()-k; i++){
        //     long sum = 0;
        //     int uniqueCount = 0;
        //     map.clear();
        //     for(int j = i; j < i + k; j++){
        //         if(!map.containsKey(nums.get(j))){
        //             map.put(nums.get(j), 1);
        //             uniqueCount++;

        //         }
                
        //         sum+=nums.get(j);

        //     } 
           
        //     if(uniqueCount >= m){
        //         result = Math.max(result, sum);
        //     }
        // }

     
        // return result;

//*** Optiamlal approach *** */

    HashMap<Integer, Integer> map = new HashMap<>();
    int uniqueCount = 0;
    long result = 0;
    long sum = 0;
    for(int i = 0; i < k; i++){
        if(!map.containsKey(nums.get(i))){
            map.put(nums.get(i), 1);
            uniqueCount++;
        }
        else{
            map.put(nums.get(i), map.get(nums.get(i)) + 1);
            //if(uniqueCount > 0){
               // uniqueCount--;
            
        }
        
        sum += nums.get(i);
    }
    if(uniqueCount >= m){
        result = sum;
    }

    for(int j = k; j < nums.size(); j++){
        int ch = nums.get(j - k);
        
        // remove


        if(map.containsKey(nums.get(j-k))){
           int val = map.get(nums.get(j-k));
           if(val == 1){
            uniqueCount--;
            map.remove(nums.get(j-k));
           }else{
           int key = map.get(nums.get(j-k));
           map.put(nums.get(j-k), key - 1);
           if(key == 1){
            uniqueCount++;
           }

           }
        }
        sum -= nums.get(j-k);

            // add
            sum += nums.get(j);
            if(!map.containsKey(nums.get(j))){
                uniqueCount++;
                map.put(nums.get(j), 1);
            }
           
            else{
                // if(uniqueCount > 0){
                //      uniqueCount--;
                // }
                map.put(nums.get(j), map.get(nums.get(j)) + 1);
               
            }
            if(uniqueCount >= m){
                result = Math.max(result, sum);
            }
    }
    return result;






    }
}