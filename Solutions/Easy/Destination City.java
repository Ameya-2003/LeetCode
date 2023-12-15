import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public String destCity(List<List<String>> paths) {
        Map<String, Integer> count = new HashMap<>();
        for (List<String> path : paths) {
            String a = path.get(0);
            String b = path.get(1);
            count.put(a, count.getOrDefault(a, 0) + 1);
        }
        for (List<String> path : paths) {
            String a = path.get(0);
            String b = path.get(1);
            if (count.containsKey(b)) {
                count.put(b, count.get(b) - 1);
                if (count.get(b) == 0) {
                    count.remove(b);
                }
            } else {
                return b;
            }
        }
        return null;
    }
}

