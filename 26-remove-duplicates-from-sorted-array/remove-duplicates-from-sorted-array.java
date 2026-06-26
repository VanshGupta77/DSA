class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;  // slow pointer

        for (int j = 1; j < nums.length; j++) { //j= fast pointer
            if (nums[j] != nums[i]) {  // found new unique element
                i++;                    // move slow pointer
                nums[i] = nums[j];      // replace unique element
            }
        }

        return i + 1;  // count of unique elements
    }
}