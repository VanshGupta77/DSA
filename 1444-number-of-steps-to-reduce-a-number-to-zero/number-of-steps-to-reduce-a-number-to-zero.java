class Solution {
    public int numberOfSteps(int num) {
        int steps =0;
        while(num > 0){
            if(num%2==0){ //Checks for even number
                num/=2; //keep dividing by 2
            }
            else{ //If number is odd
                num -=1;
            }
            steps++;
        }
        return steps;
    }
}