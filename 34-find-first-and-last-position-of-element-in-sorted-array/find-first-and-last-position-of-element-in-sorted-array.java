class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = -1; //means we haven't found first yet
        int last = -1; //means we haven't found last yet
        for(int i =0; i<nums.length; i++){
            if(nums[i] == target){ 
                if(first == -1){ //means we have already found Target , now we just checking if we have found it before or not
                    first = i; //updates the location of first means we found it here
                }
                    last =i ; //keeps updating last position
            }
        }
        return new int[]{first , last};
    }
}