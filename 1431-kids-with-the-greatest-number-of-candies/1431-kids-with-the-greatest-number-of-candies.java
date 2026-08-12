class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];
        for(int i = 0; i < candies.length; i++){
            max = Math.max(candies[i], max);
        }
        ArrayList<Boolean> list = new ArrayList<>();

        for(int val : candies){
            int temp = val + extraCandies;
            if(temp >= max){
                list.add(true);
            }
            else{
                list.add(false);
            }
        }
        return list;
    }
}