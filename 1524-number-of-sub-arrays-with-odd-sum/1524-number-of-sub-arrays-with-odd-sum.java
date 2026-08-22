class Solution {
    private final int MOD = 1000000007;
    public int numOfSubarrays(int[] arr) {
        //**** Brute force approach ***** */
        // int subcount = 0;
        // for(int i =0; i < arr.length; i++){
        //     int sum = 0;
        //     for(int j = i; j < arr.length; j++){
        //         sum+=arr[j];
        //         if(sum % 2 == 1){
        //             subcount++;
        //         }
        //     }
        // }
        // return subcount;

        // ************* Optimal Approach **************

        

        int prefixSum = 0;
       int ans = 0;
      
       int oddCount = 0;
       int evenCount = 1;

        for(int i = 0; i < arr.length; i++){

            prefixSum += arr[i];
            if(prefixSum % 2 == 1){
                ans += evenCount;
                oddCount++;
            }
            else{
                ans += oddCount;
                evenCount++;
            }
            ans %= MOD;



        }
        return ans;
    

        












        
    }
}