import java.util.HashMap;

// 1.3

public class CheckMap {

    private java.util.Map<String, Integer> map = new HashMap<>();

    public void addMap(String key, int value) {
        if (!map.containsKey(key)) {
            map.put(key, value);
        } else {
            int valueMap = map.get(key);
            if (valueMap == value) {
                throw new IllegalArgumentException();
            } else {
                map.put(key, valueMap + value);
            }
        }
    }
}