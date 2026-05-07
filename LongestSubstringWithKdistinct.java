import java.util.*;

public class Main {
    public static int longestKSubstr(String s, int k) {

        int i = 0;
        int j = 0;

        int ans = -1;

        HashMap<Character, Integer> map = new HashMap<>();

        while (j < s.length()) {

            char ch = s.charAt(j);

            map.put(ch, map.getOrDefault(ch, 0) + 1);

            // Case 1 & 2
            if (map.size() <= k) {

                if (map.size() == k) {
                    ans = Math.max(ans, j - i + 1);
                }

                j++;
            }

            // Case 3
            else {

                while (map.size() > k) {

                    char left = s.charAt(i);

                    map.put(left, map.get(left) - 1);

                    if (map.get(left) == 0) {
                        map.remove(left);
                    }

                    i++;
                }

                j++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        String s = "aabacbebebe";
        int k = 3;

        System.out.println(longestKSubstr(s, k));
    }
}
