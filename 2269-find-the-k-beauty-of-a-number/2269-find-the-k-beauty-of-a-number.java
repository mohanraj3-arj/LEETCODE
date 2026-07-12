class Solution {
    public int divisorSubstrings(int num, int k) {
        String nums1 = Integer.toString(num);

        // int count = 0;
        // int x = 0;
        

        
        // for(int i = 0; i <= nums1.length()-k; i++){
        //     String temp = "";
        //     for(int j = i; j < i+k; j++){
                
        //         temp += nums1.charAt(j);
  
        //     }
        //       x = Integer.parseInt(temp);
        //     if(x != 0){
        //         if(num % x == 0){
        //         count++;
        //        }
        //     }
        // }
        // return count;




        int count = 0;
        String temp = "";

         if(nums1.length() == k){
           if(num % num == 0){
            count++;
            return count;
           }
        }

        for(int i = 0; i < k; i++){
            temp += nums1.charAt(i);
        }
        int x = Integer.parseInt(temp);
        if(x != 0){
            if(num % x == 0){
                count++;
            }
        }
        for(int j = k; j < nums1.length(); j++){
            
       
               temp += nums1.charAt(j);
                temp = temp.substring(1);
            
           
         if(temp.length() != 0){
             x = Integer.parseInt(temp);

         }
           
            if(x != 0){
                if(num % x == 0){
                    count++;
                }
            }
        }
        return count;
        
    }
}