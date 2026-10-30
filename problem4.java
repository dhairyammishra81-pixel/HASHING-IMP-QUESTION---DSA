
import java.util.*;

public class problem4 {

    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();
        HashSet<String> destinations = new HashSet<>();

       
        map.put("Chennai", "Bengaluru");
        map.put("Mumbai", "Delhi");
        map.put("Goa", "Chennai");
        map.put("Delhi", "Goa");

       
        for (String city : map.values()) {
            destinations.add(city);
        }

       
        String start = "";

        for (String city : map.keySet()) {
            if (!destinations.contains(city)) {
                start = city;
                break;
            }
        }

     
        System.out.print(start);

        while (map.containsKey(start)) {

            String next = map.get(start);

            System.out.print(" -> " + next);

            start = next;
        }
    }
}
