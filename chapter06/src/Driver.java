import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;


public class Driver {
    public static final void print_output(int a){
        System.out.println(a+"번 군사가 죽습니다.");
    }



    public static void main(String[] args) {
        System.out.println("김신은 " + getSurvivingIndex(20, 5) + "번 자리에 서있으면 됩니다.");

    }



    public static int getSurvivingIndex(int n, int k) {

        ArrayList<Integer> Person = new ArrayList<>(n); //사람을 저장할 ArrayList 객체 생성
         int death =k; //죽어야할 인덱스의 값 초기화
         int temp =death;
        int result;
        int people = n; //사람의 수

        for (int a =1; a <= people; a++) { //인원수 만큼 반복하며 Array List 에 자리번호 추가
            Person.add(a);
        }


        while (Person.size() != 1 ) { // Person.size가 1일때 까지 반복

            print_output(Person.get(death - 1) ); //죽은 인덱스 출력
            Person.remove(death - 1); //ArrayList에서 제거

            death = death + (temp -1); //다음번에 삭제할 인덱스 값

            while (death <= Person.size() == false) { // death가 List의 size보다 작을때까지 반복
                if (death > Person.size()) {
                    death = death - Person.size();
                }
            }
        }
        result = Person.get(0);
        return result;

    }




}
