class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        //int[] arr = new int[2 * n];
        // arr[0] = nums[0];
        
        // int left = 1;
        // int right = n;
        // int index = 1;

        // while(index < nums.length){
        //     if(index % 2 == 0){
        //         arr[index] = nums[left];
        //         left++;
        //     }
        //     else{
        //         arr[index] = nums[right];
        //         right++;
        //     }
        //     index++;
        // }
        // return arr;

// optimal 1ms solutions 

        int index = 0;
    int[] arr = new int[2 * n];
        for(int i = 0; i < n; i++){
            arr[index++] = nums[i];
            
            arr[index++] = nums[i+n];
            
        }
        return arr;
    }
}