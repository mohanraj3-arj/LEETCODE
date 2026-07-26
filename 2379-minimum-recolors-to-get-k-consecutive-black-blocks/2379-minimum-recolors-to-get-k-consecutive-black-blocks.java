class Solution {
    public int minimumRecolors(String blocks, int k) {

        int minWhite = Integer.MAX_VALUE;
        int n = blocks.length();
        if(n == k){
            int whiteC = 0;
            for(int i = 0; i < n; i++){
                if(blocks.charAt(i) == 'W'){
                    whiteC++;
                }
            }
            return whiteC;
        }
        for(int i = 0; i <= n-k; i++){
            int whiteCount = 0;
            for(int j = i; j < i+k; j++){
                char ch = blocks.charAt(j);
                if(ch == 'W'){
                    whiteCount++;
                }
            }
            if(whiteCount == 0){
                return 0;
            }
            minWhite = Math.min(minWhite, whiteCount);
        }
        return minWhite;
        
    }
}