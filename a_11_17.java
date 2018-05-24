import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class a_11_17 {

    /*
    17. Write a method called subMap that accepts two maps from strings to strings as its parameters and returns true if
    every key in the first map is also contained in the second map and maps to the same value in the second map. For
    example, {Smith=949–0504, Marty=206–9024} is a submap of
    {Marty=206–9024, Hawking=123–4567, Smith=949–0504, Newton=123–4567}. The empty map is a submap of every map.
     */

    public static void main(String[] args) {

        Map<String, String> testMap1 = new HashMap<>();
        Map<String, String> testMap2 = new HashMap<>();
        Map<String, String> testMap3 = new HashMap<>();

        testMap1.put("Smith", "949-0504");
        testMap1.put("Marty", "206-9024");

        testMap2.put("Marty", "206-9024");
        testMap2.put("Hawking", "123-4567");
        testMap2.put("Smith", "949-0504");
        testMap2.put("Newton", "123-4567");

        System.out.println("testMap1: \n" + testMap1);
        System.out.println("testMap2: \n" + testMap2);
        System.out.println("testMap3: \n" + testMap3);
        System.out.println("Result should be true: " + subMap(testMap1, testMap2));
        System.out.println("Result should be true: " + subMap(testMap3, testMap2));
    }

    public static boolean subMap(Map<String, String> map1, Map<String, String> map2) {

        boolean returnBoolean;

        // entrySet creates a Set view which allows for the containsAll call
        // checks if map2 has all the elements of map1
        returnBoolean = map2.entrySet().containsAll(map1.entrySet());

        return returnBoolean;
    }
}
