class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if((long) m * k > bloomDay.length){
            return -1;
        }
        int max = bloomDay[0];
        int min = bloomDay[0];
            for(int i = 1; i < bloomDay.length; i++){
                if(max < bloomDay[i]){
                    max = bloomDay[i];
                }
                if(min > bloomDay[i]){
                    min = bloomDay[i];
                }
            }
            int left = min;
            int right = max;
           

            while(left < right){
                int mid = (left + right) / 2;
                if(makeBoqutes(bloomDay,  m,  k,  mid)){
                    
                    right = mid;
                }
                else{
                    left = mid + 1;
                }
            }
       
                return left;
          
    }
    public boolean makeBoqutes(int[] arr, int m, int k, int mid){

            int buqutes = 0;
            int flowers = 0;

            for(int i = 0; i < arr.length; i++){
                if(arr[i] <= mid){
                    flowers++;
                }
                else{
                    flowers = 0;
                }
                if(flowers == k){
                    buqutes++;
                    flowers=0;
                }
               

            }
            return buqutes >= m;

    }
}