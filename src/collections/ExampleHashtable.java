package collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class ExampleHashtable {
    public static void main(String[] args) {
        Map<Integer,String> map = new Hashtable<>();
        map.put(1, "Reshma");
        map.put(2, "Sagar");
        map.put(3, "Archna");
        map.put(4, "Mahesh");
        map.put(5, "Nyra");
        map.put(1, "Siya");
        map.put(8,"Reshma");

//        System.out.println(map.get(2));
        System.out.println(map.put(2, "Partner"));

        for(Map.Entry<Integer,String> e : map.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue());
        }

    }
    }

