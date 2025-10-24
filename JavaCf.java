 import java.util.*;

public class CFExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Ashok");
        list.add("Kamijou");
        list.add("Misaka");

        // Iterating
        for(String name : list) {
            System.out.println(name);
        }

        // Access by index
        System.out.println(list.get(1)); // Kamijou

        // Remove
        list.remove("Misaka");
        System.out.println(list);



        Set<String> set = new HashSet<>();
        set.add("Ashok");
        set.add("Kamijou");
        set.add("Ashok"); // duplicate ignored

        System.out.println(set); // prints unique elements only




        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Ashok");
        map.put(2, "Kamijou");
        map.put(3, "Misaka");

        System.out.println(map.get(2)); // Kamijou
        map.remove(3);
        System.out.println(map);


    }
}
