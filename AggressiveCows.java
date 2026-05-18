class Solution {

    public boolean canPlaceCows(int[] stalls, int k, int guess) {

        int cows = 1;

        // first cow placed at first stall
        int prevPos = stalls[0];

        for (int i = 1; i < stalls.length; i++) {

            int dist = stalls[i] - prevPos;

            // distance too small
            if (dist < guess) {
                continue;
            }

            // place cow
            cows++;

            // update previous position
            prevPos = stalls[i];
        }

        if (cows >= k) {
            return true;
        }

        return false;
    }
}
