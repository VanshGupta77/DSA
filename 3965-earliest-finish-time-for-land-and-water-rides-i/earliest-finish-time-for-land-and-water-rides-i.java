class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
    //    To get Minimun Overall Time
        int minFinish = Integer.MAX_VALUE;
        int n = landStartTime.length;
        int m = waterStartTime.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
            // If we go land Slides 1st
                int plan1 = Math.max(landStartTime[i] + landDuration[i], waterStartTime[j]) + waterDuration[j];
            // If we go Water Slides 1st   
                int plan2 = Math.max(waterStartTime[j] + waterDuration[j], landStartTime[i]) + landDuration[i];
            // To Calculate Minimum finish Time out of both Plans
                minFinish = Math.min(minFinish, Math.min(plan1, plan2));
            }
        }
        return minFinish;
    }
}