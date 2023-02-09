package Hashing;
import java.util.*;

public class HMap {

    public static void main(String[] args) {

        // Creating a HashMap(Unordered)
        HashMap<String, Integer> map = new HashMap<>();

        // Insertion of Pairs(key <-> value)
        map.put("India",1000000);
        map.put("China",5000000);
        map.put("Bangladesh",50000);

        // Displaying the pairs of HashMap
        System.out.println(map);

        //If the key already exists, then it will update the value of the key
        map.put("Bangladesh",70000);
        System.out.println(map);

        // Searching/Look Up Operation for key
        if(map.containsKey("China"))
            System.out.println("China is present");
        if(!(map.containsKey("Indonesia")))
            System.out.println("Indonesia is not present");

        // Accesing the value of a particular key
        /*
             --> If the key exists, then it will return the value of the key.
             --> If the key does not exists, then it will return null.
         */
        System.out.println(map.get("China"));
        System.out.println(map.get("Indonesia"));

        // Iteration in HashMap
        for(Map.Entry<String,Integer> it : map.entrySet())
        {
            System.out.println(it.getKey()+" --> "+it.getValue());
        }

        // Displaying all the keys of the HashMap
        Set<String> keys = map.keySet();
        for(String key : keys)
        {
            System.out.print(key+" ");
        }
        System.out.println();

        // Another way of Iteration of HashMap Pairs
        Set<String> key_it = map.keySet();
        for(String key : key_it)
        {
            System.out.println(key+" --> "+map.get(key));
        }

        // Removing a pair from a HashMap
        map.remove("China");
        System.out.println(map);

        map.remove("Indonesia");
        System.out.println(map);
    }
}
