class Solution {
    public int climbStairs(int n) {
        if(n==0 || n==1){
            return 1;
        }
        // int stairOne = climbStairs(n-1);
        // int stairTwo = climbStairs(n-2);
        // int totalWays = stairOne + stairTwo;
       
        int stairOne = 1;  // climbStairs(n-1)
        int stairTwo = 1;  // climbStairs(n-2)
        int totalWays = 0;

        for (int i = 2; i <= n; i++) {
            totalWays = stairOne + stairTwo;
            stairTwo = stairOne;
            stairOne = totalWays;
        }
        return totalWays;
    }
}