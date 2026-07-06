class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        // **** Brute force approach****
        // HashSet<Integer> set = new HashSet<>();

        //  for(int i = 0; i < nums1.length; i++){
        //     for(int j = 0; j < nums2.length; j++){
        //         if(nums1[i] == nums2[j]){
        //             set.add(nums1[i]);
        //         }
        //     }
        //  }
        //  int[] arr = new int[set.size()];

        //  int index = 0;
        //  for(int i : set){
        //     arr[index] = i;
        //     index++;
        //  }
        //  return arr;
    //**** */ Optimal approach ****

    Set<Integer> set1 = new HashSet<>();
    Set<Integer> set2 = new HashSet<>();

    for(int i : nums1){
        if(!set1.contains(i)){
            set1.add(i);
        }
    }
    for(int j : nums2){
        if(set1.contains(j)){
            set2.add(j);
        }
    }
    int[] arr = new int[set2.size()];
    int index = 0;
    for(int i : set2){
        arr[index] = i;
        index++;
    }
    return arr;
    }
}