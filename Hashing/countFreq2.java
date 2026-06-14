package Hashing;
import java.util.HashMap;

public class countFreq2 {
    public static void main(String[] args) {

        int[] arr = {4, 2, 4, 1, 2, 2};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        for (Integer key : map.keySet()) {
            System.out.println("count of " + key + " is: " + map.get(key));
        }
    }
}

