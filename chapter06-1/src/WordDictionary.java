import java.util.HashMap;

public class WordDictionary {

    HashMap<String, String> eng_to_kor = new HashMap<>();
    public void addWord(String e, String k) {
        eng_to_kor.put(e, k);
    }


    public String find(String e) {
        for (String key : eng_to_kor.keySet()) {
         if (key.toUpperCase().equals(e.toUpperCase())){ return eng_to_kor.get(key);}
        }

        return null;
    }


}