class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
    //     int index = 0;
    //     int len = nums.length;
    //     int[] arr = new int[len-k+1];

    //     for(int i = 0; i <= nums.length-k; i++){
    //         int max = i;
    //         for(int j = i; j < i+k; j++){
    //             if(nums[j] > nums[max]){
    //                 max = j;
    //             }
    //         }
    //         if(k != 1){
    //         arr[index] = nums[max];
    //         index++;
    //         }
    //         else{
    //             return nums;
    //         }    
    //     }
    //     return arr;
    //

    // **** Optimal solutions ****

        int[] result = new int[nums.length - k + 1];
        Deque<Integer> deque = new ArrayDeque<>();
        for(int i = 0; i < nums.length; i++){

            while(!deque.isEmpty() && nums[deque.peekLast()] < nums[i]){
                deque.removeLast();
            }
            deque.addLast(i);
            if(deque.peekFirst() <= i - k){
                deque.removeFirst();
            }
            if(i >= k - 1){
                result[i - k + 1] = nums[deque.peekFirst()];
            }
        }
        return result;
     }
}