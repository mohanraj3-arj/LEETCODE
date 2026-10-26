class Solution {
    public int shipWithinDays(int[] weights, int days) {
           
           int sum = weights[0];
           int maxvalue = weights[0];

           for(int i = 1; i < weights.length; i++){
                sum += weights[i];
                if(weights[i] > maxvalue){
                    maxvalue = weights[i];
                }
           }

           int left = maxvalue;
           int right = sum;

           while(left <= right){
                int mid = (left + right) / 2;

                int findDays = findNoOfDays(weights, mid);

                if(findDays <= days){
                    right = mid-1;
                }
                else{
                    left = mid+1;
                }
           }
           return left;
    }
    public int findNoOfDays(int[] weights, int capacity){
        int days = 1;
        int load = 0;

        for(int i = 0; i < weights.length; i++){
            if(load + weights[i] > capacity){
                days++;
                load = weights[i];
            }
            else{
                load+=weights[i];
            }
        }
        return days;
    }
}