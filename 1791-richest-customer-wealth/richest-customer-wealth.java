class Solution {
    public int maximumWealth(int[][] accounts) {
        int curSum = 0;
        for (int[] customers : accounts) {
            int totalSum = 0;
            for (int account : customers) {
                // Add account to Total Sum
                totalSum += account;
            }
            curSum = Math.max(curSum, totalSum); // Compare Current Sum with TotalSum and keep the Bigger One 
        }
        return curSum;
    }
}