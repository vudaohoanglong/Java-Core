package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BuiltInArray {
    public static void main(String[] args) {
        String[] pokemonArray = {"Pikachu","Pichu"};
        System.out.println(pokemonArray[0]); // get value of index
        System.out.println(pokemonArray.length); // get size of array

        // create new List with Built-in array content
        List<String> pokemonList;
        pokemonList = new ArrayList<>(Arrays.stream(pokemonArray).toList());
        pokemonList.add("Mewtwo");

        System.out.println(pokemonList);
    }
}
