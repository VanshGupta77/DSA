class Solution {
    public int missingNumber(int[] nums) {
        int xor=0;
        int n = nums.length;

        for(int i=0; i<=n; i++){ //take XOR from range 0 to n
            xor = xor ^ i;
        }

        for(int i=0 ; i<nums.length; i++){// take XOR of Actual Array Elements
            xor = xor^nums[i];
        }
        return xor;
    }
}