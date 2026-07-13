class Solution {
    public int[] decrypt(int[] code, int k) {


        int[] decode = new int[code.length];
            if(k > 0){
                for(int i = 0; i < code.length; i++){
                    int sum = 0;
                    for(int j = 1; j <= k; j++){

                        int nextIndex = (i + j) % code.length; 

                        sum += code[nextIndex];

                    }
                    decode[i] = sum;
                }
                
            }
            else{
                k = Math.abs(k);
                for(int i = 0; i < code.length; i++){
                    int sum = 0;

                    for(int j = 1; j <= k; j++){
                        int previousIndex = (i - j + code.length) % code.length;
                        sum += code[previousIndex];
                    }
                    decode[i] = sum;
                }
                
            }

        return decode;
    }
}