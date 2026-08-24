class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
           ArrayList<Integer> list = new ArrayList<>();

           for(int i = 0; i < arr.length-1; i++){
            int difference = Math.abs(arr[i] - arr[i+1]);
            list.add(difference);
           }
          int first = list.get(0);
           for(int num : list){
            if(first != num){
                return false;
            }
           }
           return true;



        // Arrays.sort(arr);
        // int previous = 0;
        // int next = 0;
        // for(int i = 1; i < arr.length-1; i++){
        //     previous = arr[i-1] - arr[i];
        //     next = arr[i+1] - arr[i];
        //     if(previous != next){
        //         return false;
        //     }
        // }
        // return true;
    }
}