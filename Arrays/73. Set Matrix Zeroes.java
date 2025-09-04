//optimal aapproach
class Solution {
    public void setZeroes(int[][] matrix) {
        int col1 = 1;

        // Traverse the arr and mark first 
        // cell of each row and column
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) { 

                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0; // row as 0

                    if (j == 0) {
                        col1 = 0;
                    } else {
                        matrix[0][j] = 0; // col as 0
                    }
                }
            }
        }
      
        // Traverse and mark the matrix from 
        // (1, 1) to (n - 1, m - 1)
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Mark the first row
        if (matrix[0][0] == 0) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[0][j] = 0;
            }
        }
        // Mark the first column
        if (col1 == 0) {
            for (int i = 0; i < matrix.length; i++) {
              matrix[i][0] = 0;
            }
        }
    }
}

=====================================================================================================
// Better approach

class Solution {
    public void setZeroes(int[][] matrix) {
        int rows[] = new int[matrix.length];
        int col[] = new int[matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    rows[i] = 1;
                    col[j] = 1;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
               if(rows[i] == 1 ||col[j] == 1){
                matrix[i][j] = 0;
               }
            }
        }
    }
}


==============================================================================================================
// Brute force
class Solution {
    public void setZeroes(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    markrow(matrix, i);
                    markcolo(matrix, j);
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == -1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public static void markrow(int[][] matrix, int i) {
        for (int j = 0; j < matrix[i].length; j++) {
            if (matrix[i][j] != 0) {
                matrix[i][j] = -1;
            }
        }
    }

   public static void markcolo(int[][] matrix, int j) {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][j] != 0) {
                matrix[i][j] = -1;
            }
        }
    }

}
