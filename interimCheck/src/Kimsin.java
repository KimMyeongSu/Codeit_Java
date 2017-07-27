import java.util.ArrayList;

public class Kimsin {

    public static void main(String[] args) {
        System.out.println("김신은 " + getSurvivingIndex(20, 5) + "번 자리에 서있으면 됩니다.");
       // System.out.println(getSurvivingIndex(8,3));
    }

    public static int getSurvivingIndex(int n, int k) {
   /*
   n명의 군사들이 동그랗게 서있고, 한 명씩 세어 나가서 매 k 번째 사람이 죽기로 합니다.
    예를 들어서 8명의 군사들이 있고 3명마다 죽기로 하면 이 순서로 군사들이 죽게 됩니다.

    3 => 6 => 1 => 5 => 2 => 8 => 4 => 7


   1  2  3  4  5  6  7  8
         (2)
   1  2  4  5  6  7  8
              (4)
    */
        ArrayList<Integer> arrayList = new ArrayList<>();

        int temp =k-1;
        for (int i =1; i<=n; i++) {
            arrayList.add(i);
        }

        while ((arrayList.size()-1) != 0) {

            System.out.println(arrayList.get(temp)+"번 군사가 죽습니다.");
            arrayList.remove(temp);

            temp = (temp + k-1) % arrayList.size();

        }

        return arrayList.get(0);
    }


}

