import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        WordDictionary dictionary = new WordDictionary();

        dictionary.addWord("Movie", "영화");
        dictionary.addWord("cat", "고양이");
        dictionary.addWord("Dog", "개");
        dictionary.addWord("book", "책");
        dictionary.addWord("soap", "비누");
        dictionary.addWord("Glasses", "안경");


        System.out.println(dictionary.find("Book"));
        System.out.println(dictionary.find("glasses"));
    }
}

class WordDictionary {
 HashMap<String,String> hashDictionary = new HashMap<>();

 public void addWord (String eng,String kor){
        hashDictionary.put(eng,kor);

 }

 public String find (String eng) {
        for (String key : hashDictionary.keySet()) {

            if(key.toUpperCase().equals(eng.toUpperCase()) ){
                return hashDictionary.get(key);
            }

        }
    return "???";
 }

}