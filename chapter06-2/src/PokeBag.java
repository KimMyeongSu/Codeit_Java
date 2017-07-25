
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class PokeBag {


    private final HashMap <String,ArrayList<Pokemon>> pokemons = new HashMap<>();

    //포켓몬을 넣을 Hashmap 자료형
    ArrayList<Pokemon>  tempList =  new ArrayList<>();


    //ArrayList<Pokemon> last = new ArrayList<>();


    public ArrayList<Pokemon> getPokemons(String name) {
        //여기서 name 좃같으면 null줘야 문제형식에 맞음 ;
        ArrayList<Pokemon> test = new ArrayList<>();

       //name을 받아서 name과 같은 이름을 가진 포켓몬을 ArrayList에 넣어서 반환

        for (int i =0; i < tempList.size(); i++) {
            if(name.equals(tempList.get(i).name)) {
                test.add(tempList.get(i));
            }


        }

        if (test.size()==0) {return null;}

        return test;
    }

    public void add(Pokemon pokemon) {
        String name = pokemon.name;
        tempList.add(pokemon);

        pokemons.put(name,getPokemons(name));

    }

    public Pokemon getStrongest(String name) {
        // name 이름의 포켓몬 목록.
        ArrayList<Pokemon> pokemonList = getPokemons(name);
        // System.out.println(pokemonList);
        if (pokemonList == null) {
            return null;
        }

        Pokemon strongest = null;

        int k = pokemonList.get(0).cp;

            for (int i=0; i< pokemonList.size(); i++) {
                if (k <= pokemonList.get(i).cp)  {
                    k = pokemonList.get(i).cp;
                    strongest =pokemonList.get(i);
                }
            }
          //  System.out.println(pokemonList);
            return strongest ;
          }


    public Pokemon getStrongest() {
        Pokemon strongest = null;

        for (String key : pokemons.keySet()) {
            strongest = getStrongest(key);


        }
        return strongest;
    }
}