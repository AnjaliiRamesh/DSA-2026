import java.util.*;

public class HMap {
    public static void main(String[] args) {
        
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Anjali", 21);
        map.put("Mannya", 19);
        map.put("Pihu", 6);

        /* 
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " -> "+ entry.getValue());
        }

        for(String key : map.keySet()) {
        System.out.println(key);
        }
        */

        HashMap<Integer, String> map2 = new HashMap<>();

        map2.put(1, "Anjali");
        map2.put(2, "Priya");
        map2.put(3, "Pushpa");
        

        // System.out.println("Mappings of HashMap are : "+map2);

        System.out.println("age of Anjali: "+map.get("Anjali"));
        System.out.println("age of priya is: "+map2.get(2));

        for(Map.Entry<Integer, String> entry : map2.entrySet()){
            System.out.println(entry.getKey() + "-> " + entry.getValue());
        }

        map2.put(2, "Neha");
        System.out.println("updated map: "+map2);

        map2.remove(2);
        System.out.println("map after removal are: "+map2);
    }

}
