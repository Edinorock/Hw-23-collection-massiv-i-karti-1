import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        // 2.2

        Map<Integer, String> orderedMap = new LinkedHashMap<>();
        orderedMap.put(20, "стол");
        orderedMap.put(25, "стул");
        orderedMap.put(30, "стул2");
        orderedMap.put(35, "стул333");
        orderedMap.put(40, "стул4");
        orderedMap.put(46, "стул5");
        orderedMap.put(50, "стул6");
        orderedMap.put(58, "полка");
        orderedMap.put(60, "полка2");

        for (Map.Entry<Integer, String> entry : orderedMap.entrySet()) {
            System.out.printf("%d : %s%n", entry.getKey(), entry.getValue());
        }
    }
}