class Solution {
    public int majorityElement(int[] nums) {
        // Arrays.sort(nums);
        // return nums[nums.length/2];

        // Moore's Voting Algorithm
        int freq = 0;
        int ans = 0;
        for(int i=0; i<nums.length; i++){
            if(freq == 0){
                ans = nums[i];
            }
            if( ans == nums[i]){
                freq++;
            }
            else{
                freq--;
            }
        }
        return ans;
    }
}