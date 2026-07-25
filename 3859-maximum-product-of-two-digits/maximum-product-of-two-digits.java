class Solution {
    public int maxProduct(int n) {
        int first = 0;   // largest digit
        int second = 0;  // second largest digit

        while (n > 0) {
            int digit = n % 10;
            n /= 10;

            if (digit >= first) {
                second = first;  // old largest digit becomes 2nd largest
                first = digit;   // new largest
            } else if (digit > second) {
                second = digit;  // new second largest
            }
        }

        return first * second;
    }
}