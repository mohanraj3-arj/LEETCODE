class Solution {
    public int longestSubstring(String s, int k) {

        // int[] freq = new int[26];
        // int longSub = 0;

        // HashMap<Character, Integer> map = new HashMap<>();
        // int longSub = Integer.MIN_VALUE;

        // for(int i = 0; i <= s.length(); i++){
        //     map.clear();
        //     int l = 0;
        //     for(int j = i; j < s.length(); j++){
        //         char ch = s.charAt(j);
        //        map.put(ch, map.getOrDefault(ch, 0) + 1);
        //        boolean valid = true;

        //         for(int val : map.values()){
        //             if(val < k){
        //                 valid = false;
        //                 break;
        //             }
                   
        //         }
        //         if(valid){
        //             longSub = Math.max(longSub, j - i + 1);
        //         }



              
        //     }
            
        // }
        // if(longSub < 0) return 0;

        //** optimal solutions ** */

   // return longSub;

      int maxlength = 0;
      if(s.length() == k)return k;

      for(int targetUnique = 0; targetUnique < s.length(); targetUnique++){

        int[] charfreq = new int[26];

        int right = 0;
        int left = 0;

        int uniquechar = 0;
        int charAtK = 0;

        while(right < s.length()){
            char ch = s.charAt(right);
            int index = ch - 'a';

            if(charfreq[index] == 0){
                uniquechar++;
            }
            charfreq[index]++;
            if(charfreq[index] == k){
                charAtK++;
            }
            while(uniquechar > targetUnique){
                char lastchar = s.charAt(left);
                int leftindex = lastchar - 'a';

                if(charfreq[leftindex] == k){
                    charAtK--;
                }
                charfreq[leftindex]--;
                if(charfreq[leftindex] == 0){
                    uniquechar--;
                }
                left++;
            }
            if(uniquechar == targetUnique && charAtK == targetUnique){
                maxlength = Math.max(maxlength, right - left + 1);
            }
            right++;
        }

      }
      return maxlength;





















       
        


        
    }
}