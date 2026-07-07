class Solution {
    public String reverseVowels(String s) {
        

        char[] arr = s.toCharArray();
        int i = 0; 
        int j = s.length()-1;

       // String result = "";

    //     while(i < j){

    //     if((arr[i] == 'A' || arr[i] == 'E' || arr[i] == 'I' || arr[i] == 'O' || arr[i] == 'U' || arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u') 
    //     && 
    //     (arr[j] == 'A' || arr[j] == 'E' || arr[j] == 'I' || arr[j] == 'O' || arr[j] == 'U' || arr[j] == 'a' || arr[j] == 'e' || arr[j] == 'i' || arr[j] == 'o' || arr[j] == 'u')){
    //         char temp = arr[i];
    //         arr[i] = arr[j];
    //         arr[j] = temp;
    //         i++;
    //         j--;
    //     }

        
    //     else if((arr[i] != 'A' || arr[i] != 'E' || arr[i] != 'I' || arr[i] != 'O' || arr[i] != 'U' || arr[i] != 'a' || arr[i] != 'e' || arr[i] != 'i' || arr[i] != 'o' || arr[i] != 'u') 
    //     && 
    //     (arr[j] == 'A' || arr[j] == 'E' || arr[j] == 'I' || arr[j] == 'O' || arr[j] == 'U' || arr[j] == 'a' || arr[j] == 'e' || arr[j] == 'i' || arr[j] == 'o' || arr[j] == 'u')){
    //         i++;
    //     }


    //     else if((arr[i] == 'A' || arr[i] == 'E' || arr[i] == 'I' || arr[i] == 'O' || arr[i] == 'U' || arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u') 
    //     && 
    //     (arr[j] != 'A' || arr[j] != 'E' || arr[j] != 'I' || arr[j] != 'O' || arr[j] != 'U' || arr[j] != 'a' || arr[j] != 'e' || arr[j] != 'i' || arr[j] != 'o' || arr[j] != 'u')){
    //         j--;
    //     }
    //     else{
    //         i++;
    //         j--;
    //     }

       
        
    // }
    //  for(char nums : arr){
    //         result += nums;
    //     }
    // return result;


    String vowel = "aeiouAEIOU";

    while(i < j){
        while(i < j && vowel.indexOf(arr[i]) == -1){
            i++;
        }
        while(i < j && vowel.indexOf(arr[j]) == -1){
            j--;
        }
        if(i < j){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    return new String(arr);
    }
    
}