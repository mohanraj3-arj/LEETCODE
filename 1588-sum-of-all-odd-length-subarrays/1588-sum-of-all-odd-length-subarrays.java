class Solution {
     public int sumOddLengthSubarrays(int[] arr) {
    //     int sum = 0;

    //    for(int i = 0; i < arr.length; i++){
    //      int oddsum = 0;

    //     for(int j = i; j < arr.length; j++){
    //         int len = j - i + 1;
    //         oddsum+=arr[j];
    //         if(len % 2 == 1){
    //             sum += oddsum;
    //         }
    //     }
   
    //    }
    //    return sum;
      
      // optimal solutions

      int[] prefix = new int[arr.length];
      prefix[0] = arr[0];
      int answer = 0;

      for(int i = 1; i < arr.length; i++){
        prefix[i] = prefix[i-1] + arr[i];
      }

      for(int i = 0; i < arr.length; i++){


        for(int j = i; j < arr.length; j++){
            int length = j - i + 1;
            int sum = 0;
            if(i > 0){
                sum = prefix[j] - prefix[i-1];
            }
            else{
                sum = prefix[j];
            }
             
            if(length % 2 == 1){
               answer += sum;
            }
        }
      }
      return answer;
    }
}