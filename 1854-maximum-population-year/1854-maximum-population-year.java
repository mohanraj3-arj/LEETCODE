class Solution {
    public int maximumPopulation(int[][] logs) {

        int maxpopulations = 0;
        int yearanswer = 0;

        for(int year = 1950; year < 2051; year++){
            int populations = 0;

            for(int i = 0; i < logs.length; i++){
                int birth = logs[i][0];
                int death = logs[i][1];
                if(birth <= year && death > year){
                    populations++;
                }
            }
            if(maxpopulations < populations){
                maxpopulations = populations;
                yearanswer = year;
            }
        }
        return yearanswer;
        
    }
}