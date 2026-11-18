class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
         ArrayList<Integer> list = new ArrayList<>();

        for(int val : nums1){
            list.add(val);
        }
        for(int val :  nums2){
            list.add(val);
        }
        Collections.sort(list);

        double ans = 0;
        int total = list.size();

        if(total % 2 == 1){
           

            return (double)list.get(total / 2);
           
        }
        else{
            ans = (list.get(total / 2 - 1) + list.get(total / 2)) / 2.0;
        }


     return ans;
     }
}