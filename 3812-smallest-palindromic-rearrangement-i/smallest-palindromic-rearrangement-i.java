class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();
        int[] counts = new int[26]; //frequency of characters

        for (int i = 0; i < n / 2; i++) {
            counts[s.charAt(i) - 'a']++;
        }

        char[] result = s.toCharArray();

        int idx = 0;
        for (int i = 0; i < 26; i++) {
            while (counts[i]-- > 0) {
                result[idx++] = (char)(i + 'a'); 
            }
        }

        for (int i = 0; i < n / 2; i++) {
            result[n - 1 - i] = result[i];   // s[n-1-i] → result[n-1-i]
        }

        return new String(result);
    }
}