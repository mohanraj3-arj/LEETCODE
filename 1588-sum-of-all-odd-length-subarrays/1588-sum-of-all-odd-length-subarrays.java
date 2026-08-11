class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;

       for(int i = 0; i < arr.length; i++){
         int oddsum = 0;

        for(int j = i; j < arr.length; j++){
            int len = j - i + 1;
            oddsum+=arr[j];
            if(len % 2 == 1){
                sum += oddsum;
            }
        }
   
       }
       return sum;
      
    }
}