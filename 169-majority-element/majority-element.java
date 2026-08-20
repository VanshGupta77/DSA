class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int freq = 1; //Frequency Count
        int ans = nums[0];

        for(int i=1; i<nums.length; i++){
            if(nums[i] == nums[i-1]){ // Means same adjacent Elements
                freq++;
                 if (freq > nums.length / 2) {  // check INSIDE loop
                    return nums[i];
                }
            }
            else{ //Means adjacent elements not equal
                freq =1; //frequency reset
                ans = nums[i]; // New element for counting
            }
        }
        if(freq > nums.length/2){ //means a element is more than half the elements of array
            return ans;
        }
           return -1;
    }
}