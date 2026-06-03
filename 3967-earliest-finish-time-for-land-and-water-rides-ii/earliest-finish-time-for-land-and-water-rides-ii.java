class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        //    Calculate Both Ways to Perform
        int land  = calc(landStartTime, landDuration, waterStartTime, waterDuration);
        int water = calc(waterStartTime, waterDuration, landStartTime, landDuration);

        // To Get Minimum time Way
        return Math.min(land, water);
    }

    private int calc(int[] s1, int[] t1, int[] s2, int[] t2) {
        // Find the Earliest finish time from all first slides
        int minEnd = Integer.MAX_VALUE;
        for (int i = 0; i < s1.length; i++) {
            minEnd = Math.min(minEnd, s1[i] + t1[i]);
        }

        // Find the Earliest Finish Time of 2nd Ride
        //  If minEnd >= s2[i] , then 2nd ride is already open we can do it
        //  If minEnd < s2[i] , then 2nd ride is yet to open we have to wait for it
        //  We board whichever happens later thats why Math.max(minEnd , s2[i])
        int finish = Integer.MAX_VALUE;
        for (int i = 0; i < s2.length; i++) {
            finish = Math.min(finish, Math.max(minEnd, s2[i]) + t2[i]);
        }
        return finish;
    }
}