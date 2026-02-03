package util;

import java.util.HashMap;
import java.util.Map;

public class MapUtil {
    public static void main(String[] args) {
        Map<String, Integer> testMap = new HashMap<>();
        testMap.put("testKey", 100);
        System.out.println("testKey: " + testMap.get("testKey"));
    }
}
