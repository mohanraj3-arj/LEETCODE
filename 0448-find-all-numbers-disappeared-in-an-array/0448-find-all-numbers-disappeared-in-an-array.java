class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> list= new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], i);
        }

        for(int i = 0; i < nums.length; i++){
            int val = i+1;
            if(!map.containsKey(val)){
                list.add(val);
            }
        }
        return list;

    }
}