package syntax;

import java.util.HashMap;
import java.util.Map;

public class MapSyntax {
    public static void main(String[] args) {
        Map<String, Integer> testMap = new HashMap<>();
        testMap.put("num", 1);
        testMap.put("num2", 2);
        System.out.println(testMap.get("num"));
    }
}
