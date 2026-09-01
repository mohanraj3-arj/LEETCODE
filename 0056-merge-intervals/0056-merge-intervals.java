class Solution {
    public int[][] merge(int[][] intervals) {

       
    if(intervals.length <= 1) return intervals;

    Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
    List<int[]> merge = new ArrayList<>();

    
    for(int i = 0; i < intervals.length; i++){
        if(merge.isEmpty() || merge.get(merge.size()-1)[1] < intervals[i][0]){
            merge.add(intervals[i]);
        }
        else{
            int end = Math.max(intervals[i][1], merge.get(merge.size()-1)[1] );
            merge.get(merge.size()-1)[1] = end;
        }
    }
    return merge.toArray(new int[merge.size()][]);

    }
}