class Solution {
    public int countGoodSubstrings(String s) {

        int count = 0;
        int k = 3;
        
        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i <= s.length()-k; i++){
            
            set.clear();
            boolean flag = true;
            for(int j = i; j < i+k; j++){
                if(set.contains(s.charAt(j))){
                    flag = false;
                }

                set.add(s.charAt(j));
            }
            if(flag==true){
                count++;
            }
            
        }
        return count;
        
    }
}