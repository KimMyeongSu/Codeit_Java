import java.util.ArrayList;
import java.util.HashMap;

public class PokemonGo {
    public static void main(String[] args) {
        PokeBag pokeBag = new PokeBag();

        pokeBag.add(new Pokemon("마그마", 1024));
        pokeBag.add(new Pokemon("마그마그", 215));
        pokeBag.add(new Pokemon("마릴", 816));
        pokeBag.add(new Pokemon("마그마그", 1306));
        pokeBag.add(new Pokemon("라프라스", 1822));
        pokeBag.add(new Pokemon("마릴", 215));
        pokeBag.add(new Pokemon("마릴", 185));
        pokeBag.add(new Pokemon("마릴", 110));
        pokeBag.add(new Pokemon("니드킹", 1709));
        pokeBag.add(new Pokemon("마릴", 39));
        pokeBag.add(new Pokemon("마자용", 12));


        System.out.println(pokeBag.getStrongest("마릴"));
    //   System.out.println(pokeBag.getStrongest("마릴"));
       System.out.println(pokeBag.getStrongest());
        System.out.println(pokeBag.getStrongest("피카츄"));



/*        HashMap<String, ArrayList<Pokemon>> pokemons = new HashMap<>();
        ArrayList<Pokemon> tempList = new ArrayList<>();
        tempList.add (new Pokemon("마릴",888));
        tempList.add (new Pokemon("마릴",666));
        tempList.add (new Pokemon("마릴",555));
        tempList.add (new Pokemon("마릴",333));

        pokemons.put("마릴",tempList);
        System.out.println(pokemons);

        for (String key : pokemons.keySet()) {
            System.out.println(pokemons.get(key));
        }*/
    }

}


class PokeBag {

    private final HashMap<String, ArrayList<Pokemon>> pokemons = new HashMap<>();

    public ArrayList<Pokemon> getPokemons(String name) {

        for (String key : pokemons.keySet()) {
            if (key.equals(name))
                return pokemons.get(key);
        }

        return null;
    }


    public void add(Pokemon pokemon) {


        if (getPokemons(pokemon.name) == null) {
            pokemons.put(pokemon.name, new ArrayList<>());
        }

        getPokemons(pokemon.name).add(pokemon); //getPoketmons (); 자체가 자료형 반환이 AraayList


    }

    public Pokemon getStrongest(String name) {

        ArrayList<Pokemon> pokemonList = getPokemons(name);

        if (pokemonList == null) {
            return null;
        }

        // return할 포켓몬(가장 센 포켓몬)을 담을 변수.
        Pokemon strongest = null;

        for (Pokemon pokemon : getPokemons(name)) {
            if (strongest == null || pokemon.cp > strongest.cp) {
                strongest = pokemon;
            }
        }

        return strongest;

    }

    public Pokemon getStrongest() {
        Pokemon strongest = null;
        ArrayList<Pokemon> pokemonList = new ArrayList<>();
        for (String key : pokemons.keySet()) {
            pokemonList.add(getStrongest(key));
        }

        System.out.println(pokemonList);
        for (int i = 0; i <pokemonList.size(); i++) {

            if (strongest == null || pokemonList.get(i).cp > strongest.cp) {
                strongest = pokemonList.get(i);
            }
        }
        return strongest;
    }



}


    class Pokemon {
        public final String name;
        public final int cp;

        public Pokemon(String name, int cp) {
            this.name = name;
            this.cp = cp;
        }

        @Override
        public String toString() {
            return name + "(" + cp + ")";
        }
      }


