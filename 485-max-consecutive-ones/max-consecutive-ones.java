class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0; //To track current streak of 1's
        int maxCount = 0; //To track Highest Streak of 1's
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1){ 
                count++;
                maxCount = Math.max(count , maxCount);
            }else{
                count = 0; //If 'i' comes on any other element than 1 in array while travelling
            }
        }
        return maxCount;
    }
}