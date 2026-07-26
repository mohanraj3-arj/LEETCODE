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


        int MinOperation = Integer.MAX_VALUE;
        HashMap<Character,Integer> map = new HashMap<>();
        int WhiteCount = 0;
        int n = blocks.length();

        for(int i = 0; i < k; i++){
            char ch = blocks.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch, 1);
            }
            else{
                int temp = map.get(ch);
                map.put(ch, temp+1);
            }
        }
        
        if(!map.containsKey('W')){
            int Black = map.get('B');
            if(Black >= k){
                return 0;
            }
        }
        MinOperation = map.get('W');

        for(int i = k; i < n; i++){
           
            char ce = blocks.charAt(i-k);
            char ch = blocks.charAt(i);
             // remove leftmost
            if(map.containsKey(ce)){
                int key = map.get(ce);
                if(key > 0){
                    map.put(ce, key-1);
                }
                else{
                    map.remove(ce);
                }
            }
            // add rightmost
            if(map.containsKey(ch)){
               map.put(ch,  map.get(ch)+1);
            }
            else{
                map.put(ch, 1);
            }
            if(!map.containsKey('W')){
            int Black = map.get('B');
            if(Black >= k){
                return 0;
            }
        }

            WhiteCount = map.get('W');
            MinOperation = Math.min(MinOperation, WhiteCount);
        }
        return MinOperation;
























        
    }
}