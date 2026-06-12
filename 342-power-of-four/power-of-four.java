class Solution {
    public boolean isPowerOfFour(int n) {
        if (n <= 0) return false;

        while (n % 4 == 0) {
            //Keep Dividing by 4
            n /= 4; 
        }
        return n == 1; // If n becomes 1 in the last of the process Then it was a Power of 4
    }
}