class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
          // Search in Sorted Matrix (Rows sorted , columns sorted , Time Complexity (O(n+m)))
    
                // Case where Starting Point is Top-Right Corner
                int row =0 , col= matrix[0].length-1;
                while(row < matrix.length && col >= 0){
                    if(matrix[row][col] == target){
                        return true;
                    }
                    else if(target < matrix[row][col]){
                        col--;
                    }
                    else{
                        row++;
                    }
                }
                return false;
            }
    }