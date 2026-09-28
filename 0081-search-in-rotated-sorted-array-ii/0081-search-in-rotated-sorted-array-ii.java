class Solution {
    public boolean search(int[] arr, int target) {
    
        int index = 0;
       
       HashSet<Integer> set = new HashSet<>();

       for(int val : arr){
        set.add(val);
       }
    int[] nums = new int[set.size()];

        for(int val : set){
            nums[index] = val;
            index++;
        }
        Arrays.sort(nums);
    
       int left = 0;
       int right = nums.length-1;

       while(left <= right){
        int mid = (left + right) / 2;

        if(nums[mid] == target){
            return true;
        }
        if(target > nums[mid]){
            left = mid+1;
        }
        if(target < nums[mid]){
            right = mid-1;
        }
       }
        return false;
    }
}