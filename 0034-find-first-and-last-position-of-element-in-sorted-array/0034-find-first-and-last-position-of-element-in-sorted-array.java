class Solution {
    public int[] searchRange(int[] nums, int target) {

        int[] arr = new int[2];
        Arrays.fill(arr, -1);

    //    for(int i = 0; i < nums.length; i++){
    //     if(nums[i] == target){
    //         arr[0] = i;
    //         break;
    //     }
    //    }
    //    for(int i = nums.length-1; i >= 0; i--){
    //     if(nums[i] == target){
    //         arr[1] = i;
    //         break;
    //     }
    //    }
    //    return arr;


    int left = 0;
    int right = nums.length-1;
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;

    while(left <= right){
        int mid = (left + right) / 2;

        if(nums[mid] == target){
            if(max < mid){
                max = mid;
            }
            left = mid+1;
        }
        if(nums[mid] > target){
            right = mid-1;
        }
        if(nums[mid] < target){
            left = mid+1;
        }
    }

    left = 0;
    right = nums.length-1;

    while(left <= right){
        int mid = (left+right) / 2;
        if(nums[mid] == target){
            if(min > mid){
                min = mid;
            }
            right = mid-1;
        }
        if(nums[mid] > target){
            right = mid-1;
        }
        if(nums[mid] < target){
            left = mid+1;
        }
    }
    if(min != Integer.MAX_VALUE){
        arr[0] = min;
    }
    if(max != Integer.MIN_VALUE){
        arr[1] = max;
    }

   
     return arr;
    }
}