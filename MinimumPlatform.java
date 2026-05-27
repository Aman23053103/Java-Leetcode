import java.util.*;

class Solution {

    static int findPlatform(
            int arr[],
            int dep[],
            int n) {

        Arrays.sort(arr);

        Arrays.sort(dep);

        int i = 1;

        int j = 0;

        int platforms = 1;

        int maxPlatforms = 1;

        while (i < n && j < n) {

            // new train arrives
            if (arr[i] <= dep[j]) {

                platforms++;

                i++;
            }

            // train departs
            else {

                platforms--;

                j++;
            }

            maxPlatforms =
                Math.max(maxPlatforms,
                         platforms);
        }

        return maxPlatforms;
    }
}
