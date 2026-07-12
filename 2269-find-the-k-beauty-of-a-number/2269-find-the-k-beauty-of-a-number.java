class Solution {
    public int divisorSubstrings(int num, int k) {
        String nums1 = Integer.toString(num);

        int count = 0;
        int x = 0;
        

        if(nums1.length() == k){
           if(num % num == 0){
            count++;
            return count;
           }
        }
        for(int i = 0; i <= nums1.length()-k; i++){
            String temp = "";
            for(int j = i; j < i+k; j++){
                
                temp += nums1.charAt(j);
  
            }
              x = Integer.parseInt(temp);
            if(x != 0){
                if(num % x == 0){
                count++;
               }
            }
        }
        return count;
        
    }
}