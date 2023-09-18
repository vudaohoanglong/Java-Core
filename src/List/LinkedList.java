package List;


public class LinkedList {
    public static void main(String[] args) {
        var pokemonList = new java.util.LinkedList<String>();
        pokemonList.add("Pikachu");
        pokemonList.add("Psyduck");
        pokemonList.add(1,"Mewth");

        System.out.println("This is a pokemon list %d   "+pokemonList);
    }
}
