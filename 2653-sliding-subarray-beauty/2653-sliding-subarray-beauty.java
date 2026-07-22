class Solution {
    public int[] getSubarrayBeauty(int[] nums, int k, int x) {


        // int index2 = 0;
        // int[] arr = new int[k];
        // int[] answer = new int[nums.length - k + 1];

        // for(int i = 0; i <= nums.length-k; i++){
        //     int index = 0;
        //     for(int j = i; j < i+k; j++){
        //         arr[index] = nums[j];
        //         index++;
        //     }
        //     Arrays.sort(arr);
        //     if(arr[x-1] < 0){
        //         answer[index2] = arr[x-1];
        //         index2++;

        //     }
        //     else{
        //         index2++;
        //     }

            
        // }
        // return answer;


        //***** Optimal Solutions ****** */




        int n = nums.length;
        int[] freq = new int[101];
        int[] ans = new int[n-k+1];

        for(int i = 0; i < k; i++){
            freq[nums[i] + 50]++;
        }
        ans[0] = beautyfind(freq, x);
        int index = 1;

        for(int i = k; i < n; i++){
            freq[nums[i-k] + 50]--;
            freq[nums[i] + 50]++;

            ans[index] = beautyfind(freq, x);
            index++;
        }
        return ans;

        
















    }
    public int beautyfind(int[] freq, int x){
            int count=0;

            for(int i = 0; i < 50; i++){
                count+=freq[i];

                if(count >= x){
                    return i - 50;
                }
            }
             return 0;
        }
       


}