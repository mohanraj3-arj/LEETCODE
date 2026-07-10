class Solution {
    public int maxVowels(String s, int k) {
        // int maxvowels = 0;
        // for(int i = 0; i <= s.length()-k; i++){
        //     int count = 0;
            

        //     for(int j = i; j < i+k; j++){
        //         char ch = s.charAt(j);
        //         if(ch == 'a'||ch=='i'||ch=='o'||ch=='u'||ch=='e'){
        //             count++;
        //         }
        //     }
        //    maxvowels = Math.max(maxvowels, count);
        // }
        // return maxvowels;

        // optimal solutions

        int count = 0;
        int maxcount = 0;
       // int left = 0;

        for(int i = 0; i < k; i++){
            char ch = s.charAt(i);
            if(ch == 'a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
        }
        maxcount = count;

        for(int j = k; j < s.length(); j++){
           char cw = s.charAt(j);
           char ce = s.charAt(j-k);
            if(cw == 'a'||cw =='e'||cw =='i'||cw =='o'||cw =='u'){
                count++;
            }
            if(ce == 'a'||ce =='e'||ce =='i'||ce =='o'||ce =='u'){
                count--;
            }
            maxcount = Math.max(maxcount, count);

        }
        return maxcount;
        
    }
}