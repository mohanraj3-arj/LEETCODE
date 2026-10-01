class Solution {
    public int singleNonDuplicate(int[] nums) {
        int xorValue = 0;
          for(int i = 0; i < nums.length; i++){
            xorValue = xorValue ^ nums[i];
          } 
          return xorValue; 
    }
}