class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int appear = nums.length / 3;
        ArrayList<Integer> list = new ArrayList<>();

       
        for(int i = 0; i < nums.length; i++){
            int numCount = 0;
            for(int j = i; j < nums.length; j++){

                    if(nums[i] == nums[j]){
                        numCount++;
                    }

            }
            if(numCount > appear){
                if(!list.contains(nums[i])){
                     list.add(nums[i]);
                }
               
                
            }
            
        }
        return list;
    }
}