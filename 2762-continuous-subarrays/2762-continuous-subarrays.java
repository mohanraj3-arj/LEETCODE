class Solution {
    public long continuousSubarrays(int[] nums) {
        
        //    long count = 0;
        //     for(int i = 0; i <= nums.length; i++){
        //         int max = i;
        //         int min = i;

        //         for(int j = i; j < nums.length; j++){
        //             if(nums[max] < nums[j]){
        //                 max = j;
        //             }
        //             if(nums[min] > nums[j]){
        //                 min = j;
        //             }
                    
        //             int sub = nums[max] - nums[min];

        //             if(sub <= 2){
        //                 count++;
        //             } 

                   
        //         }
                
        //      }  

            // int left = 0;
            // int sub = 0;

            // int max = 0; 
            // int min = 0;
            // int count = 0;

            // for(int i = 0; i < nums.length; i++){
                
                

            //     if(nums[max] < nums[i]){
            //         max = i;
            //     }
            //     if(nums[min] > nums[i]) min = i;

            //     sub = nums[max] - nums[min];

            //     while(sub > 2){
            //         sub -= sub;
            //           left++;
            //         min = left;
            //         max = left;

            //         sub = nums[max] - nums[min];
              
                   
            //     }
            //     if(sub <= 2)
            //     count += i - left+1;
            // }     



            // return count;




            
            long SubCount = 0;
            int left = 0;

            Deque<Integer> MinD = new LinkedList<>();
            Deque<Integer> MaxD = new LinkedList<>();

            for(int i = 0; i < nums.length; i++){

                while(!MinD.isEmpty() && nums[MinD.peekLast()] >= nums[i]){
                    MinD.pollLast();
                }
                while(!MaxD.isEmpty() && nums[MaxD.peekLast()] <= nums[i]){
                    MaxD.pollLast();
                }
                MinD.offerLast(i);
                MaxD.offerLast(i);

                while(nums[MaxD.peekFirst()] - nums[MinD.peekFirst()] > 2){
                    left++;
                    if(MinD.peekFirst() < left) MinD.pollFirst();
                    if(MaxD.peekFirst() < left) MaxD.pollFirst();
                }
                SubCount += i - left + 1;
            }

        return SubCount;


    }
}