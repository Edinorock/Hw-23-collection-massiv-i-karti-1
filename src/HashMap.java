import java.util.*;

// 2.2

public class HashMap {

    private static final Random RANDOM = new Random();

    private final Map<String, List<Integer>> HashMap = new java.util.HashMap<>();

    public HashMap() {
        for (int i = 0; i < 5; i++) {
            HashMap.put(String.valueOf(i), generateList());
        }
    }

    public Set<Map.Entry<String, List<Integer>>> getOriginalMapEntries() {
        return HashMap.entrySet();
    }

    public Map<String, Integer> getTransformedCollection() {
        Map<String, Integer> result = new java.util.HashMap<>();
        for (Map.Entry<String, List<Integer>> entry : HashMap.entrySet()) {
            int sum = 0;
            for (Integer number : entry.getValue()) {
                sum += number;
            }
            result.put(entry.getKey(), sum);
        }
        return result;
    }

    private List<Integer> generateList() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(RANDOM.nextInt( 1001));
        }
        return list;
    }
}