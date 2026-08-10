class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
                int sumA = 0, sumB = 0;

        for (int x : aliceSizes) {
            sumA += x;
        }
        Set<Integer> set = new HashSet<>();
        for (int y : bobSizes) {
            sumB += y;
            set.add(y);
        }
        int diff = (sumA - sumB) / 2;
        for (int x : aliceSizes) {
            if (set.contains(x - diff)) {
                return new int[]{x, x - diff};
            }
        }
        return new int[]{};
    }
}