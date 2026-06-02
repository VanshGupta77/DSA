class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int land  = calc(landStartTime, landDuration, waterStartTime, waterDuration);
        int water = calc(waterStartTime, waterDuration, landStartTime, landDuration);
        return Math.min(land, water);
    }

    private int calc(int[] s1, int[] t1, int[] s2, int[] t2) {
        // Find earliest finish time among all first-category rides
        int minEnd = Integer.MAX_VALUE;
        for (int i = 0; i < s1.length; i++) {
            minEnd = Math.min(minEnd, s1[i] + t1[i]);
        }

        // Find earliest finish time among all second-category rides
        // max(minEnd, s2[i]) = actual boarding time (wait if ride not open yet)
        int finish = Integer.MAX_VALUE;
        for (int i = 0; i < s2.length; i++) {
            finish = Math.min(finish, Math.max(minEnd, s2[i]) + t2[i]);
        }

        return finish;
    }
}