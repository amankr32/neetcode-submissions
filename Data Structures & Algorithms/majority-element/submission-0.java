class Solution {
    public int majorityElement(int[] nums) {
        int element = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                element = nums[i];
            }
            count += (nums[i] == element) ? 1 : -1;
        }
        return element;
    }
}