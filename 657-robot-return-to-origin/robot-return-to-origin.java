class Solution {
    public boolean judgeCircle(String moves) {
        int x=0;
        int y=0;

        for(int i=0 ; i<moves.length(); i++){
            char dir = moves.charAt(i);

            // NORTH
            if(dir == 'U'){
                y++;
            }
            // EAST
            else if(dir == 'R'){
                x++;
            }
            // SOUTH
            else if(dir == 'D'){
                y--;
            }
            // WEST
            else{
                x--;
            }
        }
        return x==0 && y==0;
    }
}