class Solution {
    public void rotate(int[] nums, int k) {
        int n= nums.length;
        k = k % n; // To always find result in less steps

        reverse(nums, 0, n-1); //Reverse Entire Array
        reverse(nums,0, k-1); //Reverse the first k-1 elements
        reverse(nums, k, n-1); //Reverse the remaining Elements of an Array
    }
    private void reverse(int nums[], int i, int j){ //Left = i ; Right = j
        while(i<j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}