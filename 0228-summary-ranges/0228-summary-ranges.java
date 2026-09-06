class Solution {
    public List<String> summaryRanges(int[] nums) {
     
  
     List<String> list = new ArrayList<>();
    int left = 0;
     while(left < nums.length){
        int right = left;

        while(right+1 < nums.length && nums[right+1] == nums[right]+1){
           right++;
        }

       
        if(right == left){
            list.add(String.valueOf(nums[left]));
        }
        else{
            list.add(String.valueOf(nums[left]) + "->"+ String.valueOf(nums[right]));
        }
        left = right+1;
        
     }
     return list;
     
    }
}