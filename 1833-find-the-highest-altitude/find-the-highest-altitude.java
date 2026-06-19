class Solution {
    public int largestAltitude(int[] gain) {
        int alt = 0, mx = Integer.MIN_VALUE;

        for (int i=0; i<gain.length; i++) {
            alt += gain[i];
            mx = Math.max(mx, alt);
        }

        return Math.max(mx, 0);
    }
}