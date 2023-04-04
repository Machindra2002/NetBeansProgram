package intenship;

import java.util.*;

public class Array {
   
     public static String[] UniqueArray(String[] names1, String[] names2) {

        List<String> list = new ArrayList<String>();
        for (String name : names1) {
            list.add(name);
        }
        for (String name : names2) {
            if (!list.contains(name)) {
                list.add(name);
            }
        }
        String[] a = list.toArray(new String[list.size()]);
        return a;

    }
    
    public static void main(String args[]){
         String[] names1 = new String[] { "kunal", "mandar", "abhi","jayesh" };
        String[] names2 = new String[] { "abhi", "machindra", "laxman", "jayesh", "rahul" };

        System.out.println(String.join(", ", Array.UniqueArray(names1, names2)));
    }
}
