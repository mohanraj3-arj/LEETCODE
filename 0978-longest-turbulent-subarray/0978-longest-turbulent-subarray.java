class Solution {
    public int maxTurbulenceSize(int[] arr) {
       
        int n = arr.length; 
       
      //  int r = 1;
        int u = 1;
        int d = 1;
        int ans = 1;
        if(n <= 1)return n;

        for(int i = 1; i < n; i++){
            if(arr[i] > arr[i-1]){
                u = d+1;
                d=1;
            }
            else if(arr[i] < arr[i-1]){
                d = u+1;
                u = 1;
            }
            else{
                d = 1;
                u = 1;
            }
            if(d > ans) ans = d;
            if(u > ans) ans = u;
        }
        return ans;
    }
}
   
