import java.util.ArrayList;

public class Driver_two {

    public static void main(String[] args) {
        System.out.println("김신은 " + getSurvivingIndex(20, 5) + "번 자리에 서있으면 됩니다.");
    }
    public static int getSurvivingIndex(int n, int k) {
        ArrayList<Integer> Army = new ArrayList<>();
        int kill_index= 0;

        for (int i =1; i <=n; i++) {
            Army.add(i);

        }
        System.out.println(Army);


        while (Army.size() != 1) {


            kill_index = (kill_index + k -1 ) % Army.size()  ;

            System.out.println(Army.remove(kill_index)+"번 군사가 죽습니다.");
        }

        return Army.get(0);
    }
}
