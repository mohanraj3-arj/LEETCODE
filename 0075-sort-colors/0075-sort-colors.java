class Solution {
    public void sortColors(int[] nums) {
        // for(int i = 0; i < nums.length; i++){
        //     int max = 0;
        //     int last = nums.length - i - 1;
        //     for(int j = 1; j <= last; j++){
        //         if(nums[max] < nums[j]){
        //             max = j;
        //         }
        //     }
        //     int temp = nums[last];
        //     nums[last] = nums[max];
        //     nums[max] = temp;
        // }

        for(int i = 0; i < nums.length; i++){
            int min = i;
            for(int j = i; j < nums.length; j++){
                if(nums[min] > nums[j]){
                    min = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[min];
            nums[min] = temp;
        }
    
        
        
    }
}