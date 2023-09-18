package List;

import java.util.List;

public class Vector {
    public static void main(String[] args) {
        java.util.Vector<String> pokemonList = new java.util.Vector<>();
        pokemonList.add("Pikachu");
        System.out.println(pokemonList.get(0));
    }
}
