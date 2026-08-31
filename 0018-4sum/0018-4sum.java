class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {

     
    //     int n = nums.length;
    //     Set<List<Integer>> set = new HashSet<>();
    //     Arrays.sort(nums);

    //    for(int i = 0; i < n; i++){
    //     for(int j = i + 1; j < n; j++){
    //         for(int k = j + 1; k < n; k++){
    //             for(int l = k + 1; l < n; l++){
    //             long sum = (long)nums[i] + nums[j] + nums[k] + nums[l];
                

    //             if(sum == target){
    //                List<Integer> list2 = (Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
    //                 set.add(list2);
                  
    //             }
    //             }
    //         }
    //     }
    //    }
  
    //     return new ArrayList<>(set);




        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();

        for(int i = 0; i < nums.length; i++){

            if(i > 0 && nums[i] == nums[i-1])continue;


           

            for(int j = i + 1; j < nums.length; j++){

                if(j != i + 1 && nums[j] == nums[j-1])continue;

                 int k = j + 1;
            int l = nums.length-1;

            

                while(k < l){
                    long sum = nums[i];
                    sum += nums[j];
                   sum += nums[k];
                   sum += nums[l];

                    if(sum == target){
                        List<Integer> list2 = Arrays.asList(nums[i], nums[j], nums[k], nums[l]);
                        set.add(list2);
                        k++;
                        l--;
                        while(k < l && nums[k] == nums[k-1]) k++;
                        while(k < k && nums[l] == nums[l+1]) l--;
                    }
                    else if(sum < target){
                        k++;
                    }
                    else{
                        l--;
                    }

                   
                    
                }


                

            }
        }



    return new ArrayList<>(set);



        
    }
}