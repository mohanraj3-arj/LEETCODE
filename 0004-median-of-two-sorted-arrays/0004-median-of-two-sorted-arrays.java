class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    //      ArrayList<Integer> list = new ArrayList<>();

    //     for(int val : nums1){
    //         list.add(val);
    //     }
    //     for(int val :  nums2){
    //         list.add(val);
    //     }
    //     Collections.sort(list);

    //     double ans = 0;
    //     int total = list.size();

    //     if(total % 2 == 1){
           

    //         return (double)list.get(total / 2);
           
    //     }
    //     else{
    //         ans = (list.get(total / 2 - 1) + list.get(total / 2)) / 2.0;
    //     }


    //  return ans;

     //****************** Optimal Solutions ***************** */


        int previous = 0;
        int current = 0;

        int left = 0;
        int right = 0;

       int middle = (nums1.length + nums2.length) / 2;

        for(int count = 0; count <= middle; count++){

            previous = current;

            if(left < nums1.length && right < nums2.length){
                if(nums1[left] < nums2[right]){
                    current = nums1[left];
                    left++;
                }
                else{
                    current = nums2[right];
                    right++;
                }

            }
           else if(left < nums1.length){
                current=nums1[left];
                left++;
            }
            else if(right < nums2.length){
                current = nums2[right];
                right++;
            }

        }

        if((nums1.length + nums2.length) % 2 == 1){
            return current;
        }
        else
        return((double)previous + current) / 2.0;







     }
}