package jetBrainsAcademy.hashtable;

import java.util.Hashtable;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
//        HashTable<String> table = new HashTable(5);
//        table.put(513, "Alice");
//        table.put(401, "Bob");
//        table.put(513, "Mike");
//        table.put(401, "Kate");
//        table.put(31, "Ann");
//        table.put(513, "John");
//
//        System.out.println(table);

//        Hashtable<Integer, String> hashtable = new Hashtable<>();
//        hashtable.put(513, "Alice");
//        hashtable.put(401, "Bob");
//        hashtable.put(513, "Mike");
//        hashtable.put(401, "Kate");
//        hashtable.put(31, "Ann");
//        hashtable.put(513, "John");
//        for (Map.Entry<Integer, String> entry : hashtable.entrySet()) {
//            System.out.print(entry.getKey() + ": " + entry.getValue());
//            System.out.println();
//        }

        Multimap<Integer, String> multimap = new Multimap<>();
        multimap.put(513, "Alice");
        multimap.put(401, "Bob");
        multimap.put(513, "Mike");
        multimap.put(401, "Kate");
        multimap.put(513, "John");

        for (int id : multimap.keySet()) {
            StringBuilder namesSB = new StringBuilder();
            for (String name : multimap.get(id)) {
                namesSB.append(name).append(" ");
            }
            System.out.println(id + ": " + namesSB.toString());
        }
    }
}
