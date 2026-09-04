class Solution {
    public int[] sortedSquares(int[] nums) {

        int[] arr = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            int squre = nums[i] *  nums[i];
            arr[i] = squre;
        }
        Arrays.sort(arr);
        return arr;
        
    }
}