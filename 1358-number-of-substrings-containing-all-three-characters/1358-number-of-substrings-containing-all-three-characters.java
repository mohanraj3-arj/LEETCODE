class Solution {
    public int numberOfSubstrings(String s) {
        

        int Subcount = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        // for(int i = 0; i <= s.length(); i++){
        //     map.clear();

        //     for(int j = i; j < s.length(); j++){
        //         char ch = s.charAt(j);
        //         if(map.containsKey(ch)){
        //             map.put(ch, map.get(ch) + 1);

        //         }
        //         else{
        //             map.put(ch, 1);
        //         }


        //         if( map.size() == 3){
        //             Subcount++;
        //         }

        //     }
             
        // }
        // return Subcount;



        
        int left = 0;
        int[] charfreq = new int[3];
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
          charfreq[ch - 'a']++;

            while(charfreq[0] > 0 && charfreq[1] > 0 && charfreq[2] > 0){
                Subcount += s.length() - i;

                charfreq[s.charAt(left) - 'a']--; 
                left++;
            }
    
        }
        return Subcount;

    }
}