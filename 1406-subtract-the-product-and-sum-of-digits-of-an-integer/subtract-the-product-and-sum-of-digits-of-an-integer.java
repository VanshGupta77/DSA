class Solution {
    public int subtractProductAndSum(int n) {
        int digit = 0;
        int product = 1; // To store Product of number
        int sum = 0; //To store Sum of number
        while(n > 0){
        digit = n%10;
        product = product*digit;
        sum = sum+digit;
        n = n/10;
        }
        int difference = product - sum; //To store the difference between the Product and the Sum
        return difference;
    }
}