class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        // int max = Integer.MIN_VALUE;
        // for(int i = 0; i < values.length; i++){
        //     for(int j = i+1; j < values.length; j++){
        //         if(i < j){
        //             max = Math.max(max, values[i] + values[j] + i - j);
        //         }
        //     }
        // }
        // return max;

        //********* Optimal Approach ************ */




        int sum = values[0];
        int maxsum = Integer.MIN_VALUE;

        for(int i = 1; i < values.length; i++){
            maxsum = Math.max(maxsum, sum + values[i] - i);
            sum = Math.max(sum, values[i] + i);
        }
        return maxsum;







    }
}