class Solution {
    boolean[] map = new boolean[26];
    int[] freq = new int[26];

    public String removeDuplicateLetters(String str) {
        // count frequency first
        for (char c : str.toCharArray()) {
            freq[c - 'a']++;
        }
        StringBuilder newStr = new StringBuilder();
        return removeDuplicates(str, 0, newStr);
    }

    // Base Case
    public String removeDuplicates(String str, int idx, StringBuilder newStr) {
        if (idx == str.length()) {
            return newStr.toString();  // return instead of print
        }

        // Kaam
        char currChar = str.charAt(idx);
        freq[currChar - 'a']--;  // reduce remaining frequency

        if (map[currChar - 'a'] == true) {  // Removing Duplicates
            return removeDuplicates(str, idx + 1, newStr);
        } else {
            // pop characters that are greater than currChar
            // AND appear later in string
            while (newStr.length() > 0) {
                char lastChar = newStr.charAt(newStr.length() - 1);
                if (lastChar > currChar && freq[lastChar - 'a'] > 0) {
                    map[lastChar - 'a'] = false;  // mark as removed
                    newStr.deleteCharAt(newStr.length() - 1);  // remove last
                } else {
                    break;
                }
            }

            map[currChar - 'a'] = true;  // Adding new Character
            // Element adds in New String as it comes for the first time
            return removeDuplicates(str, idx + 1, newStr.append(currChar));
        }
    }
}