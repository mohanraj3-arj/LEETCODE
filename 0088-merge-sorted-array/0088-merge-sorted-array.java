class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        
       int l = 0;
       int r = 0;
       int index = 0;

       int[] arr = new int[nums1.length];

       if(n == 0) {
           for(int i = 0; i < nums1.length; i++){
            arr[i] = nums1[i];
           }
       }

    
       while(l < nums1.length-n && r < nums2.length ){
        if(nums1[l] < nums2[r]){
            
            arr[index] = nums1[l];
            index++;
            
            l++;
            
        }
        else if(nums1[l] > nums2[r]){
           
                arr[index] = nums2[r];
                index++;
                
            
            r++;
        }
        else{
            arr[index] = nums1[l];
            index++;
            l++;
            arr[index] = nums2[r];
            index++;
            r++;
        }

       }

       while(r < nums2.length){
        
            arr[index] = nums2[r];
            index++;
        
        r++;
       }
       while(l < nums1.length && index < arr.length){
       
            arr[index] = nums1[l];
            index++;
        
        l++;
       }

        
       for(int i = 0; i < arr.length; i++){
        nums1[i] = arr[i];
       }
        
        
    }
}