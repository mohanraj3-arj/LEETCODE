class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] arr = new int[2];

        // for(int i = 0; i < numbers.length; i++){
        //     for(int j = i+1; j < numbers.length; j++){
        //         if(numbers[i] + numbers[j] == target){
        //             arr[0] = i+1;
        //             arr[1] = j+1;
                   
        //         }
        //     }
        // }
        // return arr;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < numbers.length; i++){
            int temp = target - numbers[i];
            if(map.containsKey(temp)){
                arr[0] = map.get(temp) + 1;
                arr[1] = i+1;
                return arr;
            }
            map.put(numbers[i], i);
        }
        return arr;
        
    }
}