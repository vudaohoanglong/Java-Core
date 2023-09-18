package Map;

import java.util.Map;

public class HashMap {
    public static void main(String[] args) {
        Map<String,String> pokemonMap = new java.util.HashMap<String,String>();
        pokemonMap.put("Pikachu","Lightning"); // add a pair <String, String> into Map
        pokemonMap.put("Bulbasar","Grass");
        pokemonMap.replace("Pikachu","Fighting"); // edit value of key
        pokemonMap.remove("Pikachu"); // remove key
        System.out.println(pokemonMap);
    }
}