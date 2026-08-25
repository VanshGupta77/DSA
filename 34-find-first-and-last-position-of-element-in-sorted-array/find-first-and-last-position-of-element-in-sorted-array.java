class Solution {
    public int[] searchRange(int[] nums, int target) {
         int i = 0;
        int j = nums.length-1;

        int first = -1;
        int second = -1;

        while(i <= j){ //first
            int mid = i + (j-i)/2;
            if(nums[mid] == target){
                first = mid;
                j = mid-1;
            }
            else if(nums[mid] < target){
                i = mid+1;
            }
            else{
                j = mid -1;
            }
        }

        i=0;
        j=nums.length-1;

        while(i<=j){ //second
             int mid = i + (j-i)/2;
            if(nums[mid] == target){
                second = mid;
                i = mid+1;
            }
            else if(nums[mid] < target){
                i = mid+1;
            }
            else{
                j = mid -1;
            }
        }
        int elements[] = {-1 , -1};
        elements[0] = first;
        elements[1] = second;

        return elements;
    }
}