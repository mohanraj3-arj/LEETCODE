class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> list= new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }

        for(int i = 0; i < nums.length; i++){
            int val = i+1;
            if(!set.contains(val)){
                list.add(val);
            }
        }
        return list;

    }
}