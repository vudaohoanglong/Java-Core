package Set;

import java.util.Set;

public class HashSet {
    public static void main(String[] args) {
        Set<String> pokemonSet = new java.util.HashSet<String>();
        pokemonSet.add("Pikachu");
        pokemonSet.add("Rayquaza");
        boolean isPikachuAvailable = pokemonSet.contains("Pikachu");
        pokemonSet.forEach((e)->{
            System.out.println(e);
        });
    }
}