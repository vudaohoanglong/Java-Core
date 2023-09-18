package Map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashTable {
    public static void main(String[] args) {
        Hashtable<String,String> pokemonMap = new Hashtable<String,String>();
        pokemonMap.put("Pikachu","Lightning");
        pokemonMap.put("Adimaml","Fighting");
        for (Map.Entry m : pokemonMap.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}