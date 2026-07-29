class Solution {
    public double myPow(double x, int n) {
        // return x * myPow(x , n-1);
        return myPow(x , (long)n);
    }
       private double myPow(double x, long n){
       if(n ==0){
            return 1;
        }
         if (n < 0) {
            return 1.0 / myPow(x, -n); //Negative Power
        }
        // int halfPowersq = optmPower(a, n/2) * optmPower(a, n/2); (More Time Complexity)
        double halfPower = myPow(x, n/2);
        double halfPowerSq = halfPower * halfPower;
        
        //N is odd
        if(n %2 != 0){
            halfPowerSq = x * halfPowerSq;
        }
        return halfPowerSq;
       }
}