class Solution {
    public String smallestSubsequence(String s) {
        int[] freq = new int[26];      // remaining frequency
        boolean[] inStack = new boolean[26]; // is char in stack
        Stack<Character> stack = new Stack<>();

        
        for (char c : s.toCharArray()) { // count frequency of each character
            freq[c - 'a']++;
        }

        for (char c : s.toCharArray()) {
            freq[c - 'a']--;  // reduce remaining count

            if (inStack[c - 'a']) continue;  // already in result

            
            while (!stack.isEmpty() && stack.peek() > c && freq[stack.peek() - 'a'] > 0) { // pop if top is greater than c AND top appears later
                inStack[stack.pop() - 'a'] = false;
            }

            stack.push(c);
            inStack[c - 'a'] = true;
        }

        StringBuilder sb = new StringBuilder();
        for (char c : stack) sb.append(c);
        return sb.toString();
    }
}