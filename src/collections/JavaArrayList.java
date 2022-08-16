package collections;

import java.io.IOException;
import java.util.ArrayList;

public class JavaArrayList {

    public static void main(String[] args) throws IOException{
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Doctor");
        arrayList.add("Advocate");
        arrayList.add("Doctor");
        arrayList.add("Engineer");
        arrayList.add("Police");
        arrayList.add(null);
        arrayList.add(null);

        System.out.println("size of the array " + arrayList.size());
        System.out.println("isEmpty of the array " + arrayList.isEmpty());
        System.out.println("Index of the array " + arrayList.get(2));
        System.out.println("remove of the array " + arrayList.remove(6));
        System.out.println("size of the array " + arrayList.equals(arrayList));


        for(Object o : arrayList){
            System.out.println(o);

    }
        System.out.println(arrayList.removeAll(arrayList));
        System.out.println(arrayList);


    }
}
