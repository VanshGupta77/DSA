class Solution {
    public boolean searchMatrix(int[][] nums, int target) {
        int row = nums.length;
        int col = nums[0].length;


        int left = 0;
        int right = row*col-1;

        while(left <= right){
            int mid = left + (right-left)/2;

            int rows = mid/col;
            int cols = mid%col;

            if(nums[rows][cols] == target){
                return true;
            }
            else if(nums[rows][cols] < target){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return false;
    }
}