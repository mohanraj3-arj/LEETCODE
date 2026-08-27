class Solution {
    public void rotate(int[][] matrix) {
        int[][] ans = new int[matrix.length][matrix[0].length];

        for(int row = 0; row < matrix.length; row++){

            for(int col = matrix[row].length-1; col >= 0; col--){

                ans[row][matrix.length-1-col] = matrix[col][row];
            }
        }

        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix[row].length; col++){
                matrix[row][col] = ans[row][col];
            }
        }
    }
}