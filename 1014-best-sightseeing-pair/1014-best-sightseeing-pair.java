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



        int maxscore = 0;
        int score = 0;

            for(int i = 0; i < values.length; i++){
               // int sum += values[i];

                maxscore = Math.max(maxscore, score + values[i] - i);
                score = Math.max(score, values[i] + i);
                
            }
            return maxscore;


    }
}