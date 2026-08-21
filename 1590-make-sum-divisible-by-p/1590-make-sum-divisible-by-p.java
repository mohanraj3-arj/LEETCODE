class Solution {
    public int minSubarray(int[] nums, int p) {
        
        long sum = 0;
        for(int num:nums){
            sum+=num;
        }
          if(sum < p) return -1;
        if(sum % p == 0) return 0;
      

        long target = sum % p;
        int result = nums.length; 
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        sum = 0;
        result = nums.length;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] % p == target) return 1;

            sum += nums[i];
            int a = (int)(sum%p);
            int b = (int)((sum-target)%p);

            if(map.containsKey(b)){
                result = Math.min(result, i-map.get(b));
            }
            map.put(a, i);
        }
        return result == nums.length ? -1:result;
    }
}