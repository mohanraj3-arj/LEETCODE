class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        int[] arr = new int[nums.length];
        arr[0] = nums[0];
        
        int left = 1;
        int right = n;
        int index = 1;

        while(index < nums.length){
            if(index % 2 == 0){
                arr[index] = nums[left];
                left++;
            }
            else{
                arr[index] = nums[right];
                right++;
            }
            index++;
        }
        return arr;
    }
}