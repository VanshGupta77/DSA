class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // First Find Current Max
        int max = 0;
        for (int i = 0; i < candies.length; i++) {
            max = Math.max(max, candies[i]);
        }

        // Now check Number of Candies for Each Kid
        List<Boolean> result = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            result.add(candies[i] + extraCandies >= max);
        }

        return result;
    }
}