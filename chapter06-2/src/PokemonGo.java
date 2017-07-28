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
        System.out.println(pokeBag.getStrongest());
        System.out.println(pokeBag.getStrongest("피카츄"));


    }

}


class PokeBag {

    private final HashMap<String, ArrayList<Pokemon>> pokemons = new HashMap<>();

        public ArrayList<Pokemon> getPokemons(String name) {
            //같은 이름의 포켓몬리스트를 찾아주는 메소드

             for (String key : pokemons.keySet()) {  // hash맵의 키만큼 반복
                if (key.equals(name))   //키값과 호출시에 입력받은 name이 같다면
                    return pokemons.get(key);  // hashmap 의 key의 값을 반환
             }

            return null; //반환할 key가 존재하지 않으면 null 반환
        }


    public void add(Pokemon pokemon) {
            //새로운 포켓몬을 추가하는 메소드

        if (getPokemons(pokemon.name) == null) { //getPokemons() 메소드를 호출하여 입력받은
                                                 //포켓몬의 이름을 키값으로  반환이 null 이면
            pokemons.put(pokemon.name, new ArrayList<>());  //포켓몬의 이름의 키값으로 새로운 ArrayList를 생성하여 hashmap에  key - ArrayList 추가
        }

        getPokemons(pokemon.name).add(pokemon); // 이미 이름이 있다면 포켓몬의 이름이 키값인 hashmap에 포켓몬을 추가


    }

    public Pokemon getStrongest(String name) {
        //같은 이름의 가장 강력한 포켓몬을 찾아주는 메소드

        ArrayList<Pokemon> pokemonList = getPokemons(name); // 새로운 ArrayList를 만들고 같은이름의 포켓몬 List로 초기화
        if (pokemonList == null) { //(포켓몬List가  null이면 ==같은이름의 포켓몬이 없다 )   null값 반환
            return null;
        }

        // return할 포켓몬(가장 센 포켓몬)을 담을 변수.
        Pokemon strongest = null;

        for (Pokemon pokemon : getPokemons(name)) { // ArrayList를 탐색
            if (strongest == null || pokemon.cp > strongest.cp) {  // strongest가 null 이거나 현재 cp 보다 반복되는 pokemon의 cp가 더높다면
                strongest = pokemon; //포켓몬 교체
            }
        }

        return strongest;

    }

    public Pokemon getStrongest() {

        // return할 포켓몬(가장 센 포켓몬)을 담을 변수.
        Pokemon strongest = null;

        // HashMap 전체를 탐색 (keySet을 통해 얻은 key로 탐색)
        for (String key : pokemons.keySet()) {

            // key에 해당하는 가장 센 포켓몬을 가져오기
            Pokemon p = getStrongest(key);

            // strongest를 가장 센 포켓몬으로 교체
            if (strongest == null || p.cp > strongest.cp) {
                strongest = p;
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


