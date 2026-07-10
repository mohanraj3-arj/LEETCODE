class Solution {
    public int countGoodSubstrings(String s) {
// ********* brute force approach ********
        // int count = 0;
        // int k = 3;
        
        // HashSet<Character> set = new HashSet<>();
        // for(int i = 0; i <= s.length()-k; i++){
            
        //     set.clear();
        //     boolean flag = true;
        //     for(int j = i; j < i+k; j++){
        //         if(set.contains(s.charAt(j))){
        //             flag = false;
        //         }

        //         set.add(s.charAt(j));
        //     }
        //     if(flag==true){
        //         count++;
        //     }
            
        // }
        // return count;

        //****** */ Better approach*******


        // int k = 3;
        // HashMap<Character, Integer> map = new HashMap<>();
        // int count = 0;
        // boolean flag = true;

        // if(s.length() < k){
        //     return 0;
        // }
        // for(int i = 0; i < k; i++){

        //    if(map.containsKey(s.charAt(i))){
        //     int temp = map.get(s.charAt(i));
        //     map.put(s.charAt(i), temp+1);
        //    }
        //    else{
        //          map.put(s.charAt(i), 1);
        //    }
          
           

        // }
        // if(map.size() == 3){
        //     count++;
        // }

        // for(int j = k; j <= s.length()-1; j++){
        //    int cw = map.get(s.charAt(j-k));
           
        //     if(cw >= 2){
        //         map.put(s.charAt(j-k), cw-1);
        //     }
        //     else{
        //         map.remove(s.charAt(j-k));
        //     }

            
        //     if(map.containsKey(s.charAt(j))){
                
        //         int temp = map.get(s.charAt(j));
        //         map.put(s.charAt(j), temp+1);
        //     }
        //     else{
        //         map.put(s.charAt(j), 1);
        //     }

        //     if(map.size() == 3){
        //     count++;

        //     }
            
        // }
        // return count;
        
// *********** Optimal Approach **********

int count=0;

for(int i = 0; i <= s.length()-3; i++){
    char a = s.charAt(i);
    char b = s.charAt(i+1);
    char c = s.charAt(i+2);

    if(a != b && b != c && a != c){
        count++;
    }
}
        return count;
    }
}