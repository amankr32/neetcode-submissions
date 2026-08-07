class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length - 1;
        for (int i = n - 2; i >= 0; i--) {
            cost[i] = Math.min(cost[i] + cost[i + 1], cost[i] + cost[i + 2]);
        }

        return Math.min(cost[0], cost[1]);
    }
}
