class Solution {
    public int singleNumber(int[] nums) {
        int xor = 0;

        // We take XOR of the Whole Arrays
        for(int i=0; i<nums.length; i++){
            xor = xor^nums[i];
        }
        // At the End , The Duplicate Elements will eliminate each other
        // And only Single Element will remain Stored in the xor

        return xor;
    }
}