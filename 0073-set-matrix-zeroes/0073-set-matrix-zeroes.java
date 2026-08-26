class Solution {
    public void setZeroes(int[][] matrix) {

    //   for(int row  = 0; row < matrix.length; row++){
    //     for(int column = 0; column < matrix[row].length; column++){
    //         if(matrix[row][column] == 0){
    //             markrow(row, matrix);
    //             markcolumn(column, matrix);
    //         }
    //     }
    //   }
    //   for(int i = 0; i < matrix.length; i++){
    //     for(int j = 0; j < matrix[i].length; j++){
    //         if(matrix[i][j] == -1){
    //             matrix[i][j] = 0;
    //         }
    //     }
    //   }


    // ************** Better Approach ****************


    int[] row = new int[matrix.length];
    int[] col = new int[matrix[0].length];

    for(int i = 0; i < matrix.length; i++){
        for(int j = 0; j < matrix[0].length; j++){
            if(matrix[i][j] == 0){
                row[i] = 1;
                col[j] = 1;
            }
        }
    }

    for(int i = 0; i < matrix.length; i++){
        for(int j = 0; j < matrix[0].length; j++){
            if(row[i] == 1 || col[j] == 1){
                matrix[i][j] = 0;
            }
        }
    }
    












        
        
    }
    // public void markrow(int row, int[][] matrix){
    //     for(int column = 0; column < matrix.length; column++){
    //         if(matrix[row][column] != 0){
    //             matrix[row][column] = -1;
    //         }
    //     }
    // }
    // public void markcolumn(int column, int[][] matrix){
    //     for(int row = 0; row < matrix.length; row++){
    //         if(matrix[row][column] != 0){
    //             matrix[row][column] = -1;
    //         }
    //     }
    // }
}