class Solution {
    public int maximumProduct(int[] nums) {
       int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        
        for(int i=0; i<nums.length; i++){
            int digit= nums[i];

            if(digit>= first){
                third =second;
                second=first;
                first=digit;
            }
            else if(digit>second){
                third=second;
                second=digit;
            }
            else if(digit>third){
                third=digit;
            }
             // track 2 smallest
            if (digit <= min1) {
                min2 = min1;
                min1 = digit;
            } else if (digit < min2) {
                min2 = digit;
            }
        }
        return Math.max(first*second*third , first*min1*min2);
    }
}