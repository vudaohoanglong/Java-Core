package List;

import java.util.List;

public class ArrayList {
    public static void  main(String[] args) {
        List<String> pokemonList = new java.util.ArrayList<>(); // create a new ArrayList name pokemonList
        pokemonList.add("Pikachu"); // add new String to ArrayList
        pokemonList.add("Pichu");
        pokemonList.add(1,"Greeninja"); // add new String to index
        System.out.println(pokemonList);
        var temp =  pokemonList.get(2);
        System.out.println(temp);
        pokemonList.set(2,"Mewtwo");
        System.out.println(pokemonList);
        for (String s : pokemonList) {
            System.out.println(s);
        }
    }
}
