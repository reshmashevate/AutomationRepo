package collections;

import java.io.IOException;
import java.util.ArrayList;
import java.util.SortedSet;
import java.util.TreeSet;

public class InterfaceObject {
    public static void main(String[] args) throws IOException {
        SortedSet<String> arrayList = new TreeSet<>();
        arrayList.add("Doctor");
        arrayList.add("Advocate");
        arrayList.add("Doctor");
        arrayList.add("Engineer");
        arrayList.add("Police");
//        arrayList.add(50);       Hetrogeneous Data

        for (Object o : arrayList) {
            System.out.println(o);
        }

    }
}