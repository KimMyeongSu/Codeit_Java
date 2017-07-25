import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
//ArrayList _test
       ArrayList<Pokemon> arrayList = new ArrayList<>();
       arrayList.add(new Pokemon("이상해씨"));
        arrayList.add(new Pokemon("리자몽"));
        arrayList.add(new Pokemon("피카츄"));

        System.out.println(arrayList);


//HashMap _test
      HashMap<String,Pokemon> myhash = new HashMap<>();
        myhash.put("풀포켓몬",new Pokemon("이상해씨"));
        myhash.put("불포켓몬",new Pokemon("리자몽"));
        myhash.put("전기포켓몬",new Pokemon("피카츄"));

        System.out.println(myhash);

        for(String key : myhash.keySet()) {
            System.out.println(myhash.get(key));
        }
    }



}
