class Solution {
    public int missingNumber(int[] nums) {
        int total =0;
        int sum=0;
        for(int ele: nums){
            sum+=ele;
        }
        for(int i=0; i<=nums.length; i++){
            total += i;
        }
        total = total - sum;
        return total;
    }
}