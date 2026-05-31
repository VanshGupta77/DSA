class Solution {
    public int diagonalSum(int[][] matrix) {
        int sum=0;
         for(int i=0; i<matrix.length; i++){
                    sum+= matrix[i][i]; //Primary Diagonal (i == j)

                    // Subtract center if odd-sized (counted twice)
                    if(i != matrix.length-1-i)
                    sum+= matrix[i][matrix.length-1-i]; //Secondary Diagonal (i+j = n-1) = (j = matrix.length-1-i)

                }
                return sum;
    }
}