class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        int pn = p.length();
        int sn = s.length();

        List<Integer> answer = new ArrayList<>();

        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();

    //     for(int i = 0; i < pn; i++){
    //         char c = p.charAt(i);
    //         map.put(c, map.getOrDefault(c, 0) + 1);
    //     }


    // for(int i = 0; i <= sn-pn; i++){
        
     
    //     map2.clear();

    //     for(int j = i; j < i+pn; j++){

    //        char ch = s.charAt(j);

    //        map2.put(ch, map2.getOrDefault(ch, 0) + 1);

    //     }
    //     if(map.equals(map2)){

    //         answer.add(i);
    //     }
    // }
    // return answer;

    //**** Optimal solutions **** */



if(pn > sn) return answer;
for(int i = 0; i < pn; i++){
    char c = s.charAt(i);
    char ch = p.charAt(i);
    map1.put(ch, map1.getOrDefault(ch, 0) + 1);
    map2.put(c, map2.getOrDefault(c, 0) + 1);
}
if(map1.equals(map2)){
    answer.add(0);
}

for(int j = pn; j < sn; j++){
    char left = s.charAt(j-pn);
    char right = s.charAt(j);

    if(map2.containsKey(left)){
        int leftchar = map2.get(left);
        if(leftchar > 1){
            map2.put(left, leftchar-1);
        }
        if(leftchar == 1){
            map2.remove(left);
        }

        
    }
   

        map2.put(right, map2.getOrDefault(right, 0) + 1);

    
    if(map1.equals(map2)){
        answer.add(j-pn+1);
    }

}


return answer;




        
    }
}