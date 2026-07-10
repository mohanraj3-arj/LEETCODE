class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        // brute force approach

        // int count = 0;
        // int average = 0;
        // for(int i = 0; i <= arr.length-k; i++){
        //     int sum = 0;
        //     for(int j = i; j < i+k; j++){
        //         sum+=arr[j];
                
        //     }
        //     average = sum / k;
        //         if(average >= threshold){
        //             count++;
        //         }
        // }
        // return count;

//********* Optimal Approach ********** */


        int count = 0;
        int average = 0;
        int sum = 0;

        for(int i = 0; i < k; i++){
            sum+=arr[i];
            
        }
            average = sum / k;
            if(average >= threshold){
                count++;
            }
        for(int j = k; j < arr.length; j++){
            sum += arr[j];
            sum -= arr[j-k];

            average = sum / k;

            if(average >= threshold){
                count++;
            }
        }
        return count;


    }
}