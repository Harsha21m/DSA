class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;

        int low = 0;
        int high = n * m - 1; //last ele in an matrix(3*4=12-1=(11 index)

        while (low <= high) {
            int mid = (low + high) / 2;
            int row = mid / m; //finding row index
            int col = mid % m; //finding col index

            if (matrix[row][col] == target) {
                return true; // found
            } else if (matrix[row][col] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false; // not found
    }
}
