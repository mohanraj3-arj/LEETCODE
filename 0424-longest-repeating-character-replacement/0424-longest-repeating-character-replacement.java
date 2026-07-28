class Solution {
    public int characterReplacement(String s, int k) {
        // int maxSub = Integer.MIN_VALUE;
        // HashMap<Character, Integer> map = new HashMap<>();
        

        // for(int i = 0; i < s.length(); i++){
        //     map.clear();
        //     int maxfreq = 0;
        //     for(int j = i; j < s.length(); j++){
        //         char ch = s.charAt(j);
        //         if(map.containsKey(ch)){
        //             map.put(ch, map.get(ch) + 1);
        //         }
        //         else{
        //             map.put(ch, 1);
        //         }
        //          int sublength = j - i + 1;

        //         for(int val : map.values()){
        //             maxfreq = Math.max(maxfreq, val);
        //         }
        //         int replacements = sublength - maxfreq;
        //         if(replacements <= k){
        //             maxSub = Math.max(maxSub, sublength);
        //         }

        //     }

           

            




        // }
        // return maxSub;

        //*** Optimized Solutions *** */



   // HashMap<Character, Integer> map = new HashMap<>();


    int left = 0;
    int maxsub = 0;
    int maxfreq = 0;

    // for(int i = 0; i < s.length(); i++){
    //     char ch = s.charAt(i);
    //     map.put(ch, map.getOrDefault(ch, 0) + 1);
    //    maxfreq = Math.max(maxfreq, map.get(ch));

    //     while((i - left + 1) - maxfreq > k){
    //         char ce = s.charAt(left);
    //         map.put(ce, map.get(ce) - 1);
    //         left++;
    //     }
    //     maxsub = Math.max(maxsub, i - left + 1);
        
    // }

    int[] arr = new int[26];

    for(int i = 0; i < s.length(); i++){
        char ch = s.charAt(i);
        arr[ch - 'A']++;

        maxfreq = Math.max(maxfreq, arr[ch-'A']);

        while((i - left + 1) - maxfreq > k){
            char cm = s.charAt(left);
            arr[cm - 'A']--;
            left++;
        }
        maxsub = Math.max(maxsub, i - left + 1);
    }


return maxsub;










    }
}