class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        

      
          

        for(int number = left; number <= right; number++){
            boolean covered = false;
            
            for(int row = 0; row < ranges.length; row++){

                if(number >= ranges[row][0] && number <= ranges[row][1]){
                    covered = true;
                    break;

                }

                
                
            }
             if(!covered){
                return false;
            }
            
           
        }
       
          
        return true;

      
    }
}