class Solution {
    public int minimumRecolors(String blocks, int k) {

        // int minWhite = Integer.MAX_VALUE;
        // int n = blocks.length();
        // if(n == k){
        //     int whiteC = 0;
        //     for(int i = 0; i < n; i++){
        //         if(blocks.charAt(i) == 'W'){
        //             whiteC++;
        //         }
        //     }
        //     return whiteC;
        // }
        // for(int i = 0; i <= n-k; i++){
        //     int whiteCount = 0;
        //     for(int j = i; j < i+k; j++){
        //         char ch = blocks.charAt(j);
        //         if(ch == 'W'){
        //             whiteCount++;
        //         }
        //     }
        //     if(whiteCount == 0){
        //         return 0;
        //     }
        //     minWhite = Math.min(minWhite, whiteCount);
        // }
        // return minWhite;

        //*** Optimized Solutions **** */


        int MinOperation = 0;
        int WhiteCount = 0;
        int n = blocks.length();

        for(int i = 0; i < k; i++){
            char ch = blocks.charAt(i);
            if(ch == 'W'){
                WhiteCount++;
            }
        }
        
       
        MinOperation = WhiteCount;

        for(int i = k; i < n; i++){
           
            char ce = blocks.charAt(i-k);
            char ch = blocks.charAt(i);
           if(ce == 'W'){
            WhiteCount--;
           }
           if(ch == 'W')WhiteCount++;
           
            MinOperation = Math.min(MinOperation, WhiteCount);
        }
        return MinOperation;
























        
    }
}