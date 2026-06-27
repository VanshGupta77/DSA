class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()){
            return false;
        }
        String vg = s + s;
        if(vg.contains(goal)){
            return true;
        }else{
            return false;
        }
    }
}