class Solution {
    public int[] getAverages(int[] nums, int k) {

        // *** Brute force approach ***

        int index = k;
        int k2 = (2 * k) + 1;
        int[] arr = new int[nums.length];
        Arrays.fill(arr, -1);
        if(k == 0){
            return nums;
        }
        for(int i = 0; i <= nums.length-k2; i++){
            long sum = 0;
            for(int j = i; j < i+k2; j++){
                sum += nums[j];
            }
            int temp = (int)(sum / k2);
            arr[index] = temp;
            index++;

        }
        
        return arr;
        
    }
}