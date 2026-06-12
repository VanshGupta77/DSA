class Solution {
    public boolean isPowerOfThree(int n) {
        if (n <= 0) return false;
        
        while (n%3 == 0){
            n = n/3; // Continue the Dividing the Number by 3
        }
        return n == 1; // If n becomes 1 in the last then it was a Power of 3
    }
}