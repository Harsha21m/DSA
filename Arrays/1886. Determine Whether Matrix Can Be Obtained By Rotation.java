

class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;

        
        for (int t = 0; t < 4; t++) {
            if (areEqual(mat, target)) {
                return true;
            }
            mat = rotate(mat); // rotate by 90° clockwise
        }
        return false;
    }

   
    private int[][] rotate(int[][] mat) {
        int n = mat.length;
        int[][] newmat = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                newmat[j][n - 1 - i] = mat[i][j];
            }
        }
        return newmat;
    }

    private boolean areEqual(int[][] a, int[][] b) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] != b[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}


//Ratoate in-place no need extra space

// private void rotateInPlace(int[][] mat) {
//     int n = mat.length;
//     // Transpose
//     for (int i = 0; i < n; i++) {
//         for (int j = i; j < n; j++) {
//             int temp = mat[i][j];
//             mat[i][j] = mat[j][i];
//             mat[j][i] = temp;
//         }
//     }
//     // Reverse each row
//     for (int i = 0; i < n; i++) {
//         for (int j = 0; j < n / 2; j++) {
//             int temp = mat[i][j];
//             mat[i][j] = mat[i][n - 1 - j];
//             mat[i][n - 1 - j] = temp;
//         }
//     }
// }
