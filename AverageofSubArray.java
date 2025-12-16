class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        int maxsum = 0;
        double average = 0;
        int i = 0;

        for (i = 0; i < k; i++) {
            sum = sum + nums[i];
        }

        maxsum = sum;
        average = (double) maxsum / k;
        while (i < nums.length) {
            sum = sum + nums[i] - nums[i - k];
            if (sum > maxsum) {
                maxsum = sum;
            }
            i++;
            average = (double) maxsum / k;
        }

        return average;
    }
}
