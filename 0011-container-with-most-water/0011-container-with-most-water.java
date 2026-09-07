class Solution {
    public int maxArea(int[] height) {
    //   int MaxArea = Integer.MIN_VALUE;

    //     for(int right = height.length-1; right >= 0; right--){
    //         int width = 0;
    //         int heigh = Integer.MAX_VALUE;
             

    //         for(int left = 0; left < right; left++){

    //            width = right - left;
    //            heigh = Math.min(height[left], height[right]);

    //           int area = width * heigh;

    //           MaxArea = Math.max(area, MaxArea);


    //         }

    //     }
    //     return MaxArea;

    // ************************ Optimal approach **********************


    int right = height.length-1;
    int left = 0;
    int MaxArea = Integer.MIN_VALUE;


    while(left < right){
        int width = right - left;
        int heigh = Math.min(height[left], height[right]);

        int area = width * heigh;
        MaxArea = Math.max(area, MaxArea);

        if(height[left] < height[right]){
            left++;
        }
        else{
            right--;
        }
    }


    return MaxArea;








    }
}