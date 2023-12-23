import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean isPathCrossing(String path) {
        Set<Long> seen = new HashSet<>();
        seen.add(0L);

        long x = 0;
        long y = 0;
        long base = 20001L;

        for (char c : path.toCharArray()) {
            switch (c) {
                case 'N':
                    y++;
                    break;
                case 'S':
                    y--;
                    break;
                case 'E':
                    x++;
                    break;
                case 'W':
                    x--;
                    break;
            }
            long key = x * base + y;
            if (seen.contains(key)) {
                return true;
            }
            seen.add(key);
        }

        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String path = "NESW";
        boolean result = solution.isPathCrossing(path);
        System.out.println("Does the path cross itself? " + result);
    }
}
