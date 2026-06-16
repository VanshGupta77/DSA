class Solution {
    public boolean isPalindrome(String s) {

        // Convert all the to Lower Case
        // Replace all which negates the Pattern
          s = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        for(int i=0; i<s.length()/2; i++){

            if(s.length() == 0) return true;

            if(s.charAt(i) != s.charAt(s.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}