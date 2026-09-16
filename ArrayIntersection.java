package Demo;

import java.util.*;
import java.util.HashMap;
public class ArrayIntersection {

    public static List<Integer> intersection(int[] a, int[] b) {
                HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : a) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<Integer> result = new ArrayList<>();
        for (int num : b) {
            if (map.getOrDefault(num, 0) > 0) {
                result.add(num);
                map.put(num, map.get(num) - 1); 
            }
        }
        return result; 
    }
}