class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int max = 0;
        for(int i = 0; i<n; i++){
            int low = i;
            int high = m-1;
            int ans = -1;

            while(low<=high){
                int mid = low + (high - low)/2;

                if(nums2[mid] >= nums1[i]){
                    ans = mid;
                    low = mid + 1;
                }else{
                    high = mid -1;
                }

                if(ans !=  -1){
                    max = Math.max(max, ans - i);
                }
            }
        }

        return max;
    }
}