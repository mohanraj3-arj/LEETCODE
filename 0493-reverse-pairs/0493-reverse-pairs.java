class Solution {
    public int reversePairs(int[] nums) {
    //    int ReversePair = 0;

    //     for(int i = 0; i < nums.length; i++){
    //         for(int j = i+1; j < nums.length; j++){
    //             if(nums[i] > 2L * nums[j]){
    //                 ReversePair++;
    //             }
    //         }
    //     }
    //    return ReversePair;
    

    //**************** Optimal Approach **************** */

        




return mergeSort(nums, 0, nums.length-1);






    }
    public int mergeSort(int[] nums, int low, int high){
       
        
        int mid = (low + high)  / 2;
       
        if(low >= high) return 0;

       int count = mergeSort(nums, low, mid) +  mergeSort(nums, mid+1, high);
       
       count += countpairs(nums, low, mid, high);
       merge(nums, low, mid, high);
       return count;

    }
   
    public void merge(int[] nums, int low, int mid, int high){
        int right = mid+1;
        int left = low;
        ArrayList<Integer> list = new ArrayList<>();
        while(left <= mid && right <= high){
            if(nums[left] <= nums[right]){
                list.add(nums[left]);
                left++;

            }
            else if(nums[right] < nums[left]){
                list.add(nums[right]);
                right++;
                
            }
        }
        while(left <= mid){
            list.add(nums[left]);
            left++;
        }
        while(right <= high){
            list.add(nums[right]);
            right++;
        }
        for(int i = low; i <= high; i++){
            nums[i] = list.get(i-low);
        }

    }
    public int countpairs(int[] nums, int low, int mid, int high){
        int right = mid + 1;
        int count = 0;

        for(int i = low; i <= mid; i++){
            while(right <= high && (long)nums[i] > 2L * nums[right]) right++;
            count += (right - (mid + 1));

        }
        return count;
    }


    }