class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {

        
        // int max = -1;
        // int n = customers.length;
        // int index = 0;

        // for(int i = 0; i <= n-minutes; i++){
        //     int sum = 0;

        //     for(int j = i; j < i+minutes; j++){
        //         if(grumpy[j] == 1){
        //             sum+=customers[j];
        //         }
        //     }
        //     if(sum > max){
        //         max = sum;
        //         index = i;
        //     }
        // }
        // for(int i = index; i <= index + minutes - 1; i++){
        //     grumpy[i] = 0;
        // }
        // int satisfiedCustomers = 0;
        // for(int j = 0; j < n; j++){
        //     if(grumpy[j] == 0){
        //         satisfiedCustomers += customers[j];
        //     }
        // }
        // return satisfiedCustomers;

        // **** Optimal Approach ****


    int max = Integer.MIN_VALUE;
    int sum = 0;
    int n = customers.length;
    
    for(int i = 0; i < minutes; i++){
        if(grumpy[i] == 1){
            sum += customers[i];
        }
    }
    max = sum;
    for(int j = minutes; j < n; j++){
            if(grumpy[j-minutes]  == 1){
                sum -= customers[j-minutes];

            }
            if(grumpy[j] == 1){
                sum += customers[j];

            }
                
           max = Math.max(max, sum);
          
    }

int satisfiedCustomer = 0;
for(int i = 0; i < n; i++){
    if(grumpy[i] == 0){
         satisfiedCustomer += customers[i];
    }
   
}
    return satisfiedCustomer + max;

















        
    }
}