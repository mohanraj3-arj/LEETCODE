class Solution {
    public int minimumCardPickup(int[] cards) {

        // ArrayList<Integer> list = new ArrayList<>();
        // int minlen = Integer.MAX_VALUE;
       
        // int n = cards.length;
        //  boolean flag = false;
        // for(int i = 0; i < n; i++){
        //     list.clear();
        //     list.add(cards[i]);
        //      int len = 0;
           
        //     for(int j = i+1; j < n; j++){
        //         list.add(cards[j]);
                
        //         if(cards[i] == cards[j]){
        //             len = list.size();
        //             flag = true;
        //              minlen = Math.min(len, minlen);
                    
                       
                     
        //            break;
        //         }
                
        //     }
           

        // }
        
        
        // if(flag){
        //      return minlen;
        // } 

        //   return -1;
         
        
//*** Optimized Solutions **** */



    Map<Integer, Integer> map = new HashMap<>();
    int min = Integer.MAX_VALUE;
    int n = cards.length;
    boolean flag = false;
   
    for(int i = 0; i < n; i++){
        if(!map.containsKey(cards[i])){
            map.put(cards[i], i);
        }
        else{
            int temp = map.get(cards[i]);
            int len = i - temp + 1;
            map.put(cards[i], i);
            flag = true;
          
            min = Math.min(min, len);
        }
    }
    if(!flag) return -1;
    
    return min;












    }
}