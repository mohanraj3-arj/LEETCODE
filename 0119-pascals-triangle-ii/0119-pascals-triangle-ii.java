class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> list1 = new ArrayList<>();

        for(int i = 0; i <= rowIndex; i++){
            List<Integer> list2 = new ArrayList<>();

            for(int j = 0; j <= i; j++){
                if(j == 0 || i == j){
                    list2.add(1);
                }
                else{
                    List<Integer> previousList = list1.get(i-1);
                    list2.add(previousList.get(j) + previousList.get(j-1));
                }
            }
            list1.add(list2);
        }
      return  list1.get(rowIndex);
    }
}