class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {

        
        int max = -1;
        int n = customers.length;
        int index = 0;

        for(int i = 0; i <= n-minutes; i++){
            int sum = 0;

            for(int j = i; j < i+minutes; j++){
                if(grumpy[j] == 1){
                    sum+=customers[j];
                }
            }
            if(sum > max){
                max = sum;
                index = i;
            }
        }
        for(int i = index; i <= index + minutes - 1; i++){
            grumpy[i] = 0;
        }
        int satisfiedCustomers = 0;
        for(int j = 0; j < n; j++){
            if(grumpy[j] == 0){
                satisfiedCustomers += customers[j];
            }
        }
        return satisfiedCustomers;
        
    }
}