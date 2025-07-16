package JAVA.Telusko;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        // Map -  a colection of key value pair 
        Map<String, Integer> players = new HashMap<>(null);

        players.put("John", 24); 
        players.put("Inl", 24);
        players.put("yhu", 24);
        players.put("jkvbk", 24); 

        // keys are unique

        System.out.println(players);

        System.out.println(players.get("John"));

        System.out.println(players.keySet()); 

        // HashTable - synchronized
    }
}