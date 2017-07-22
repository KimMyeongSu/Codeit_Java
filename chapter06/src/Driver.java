import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;


public class Driver {
    public static final void print_output(int a){
        System.out.println(a+"번 군사가 죽습니다.");
    }


    public static void main(String[] args) {
        System.out.println("김신은 " + getSurvivingIndex(20, 5) + "번 자리에 서있으면 됩니다.");
     //     System.out.println(getSurvivingIndex(20,5));

//
//        ArrayList<Integer> Person = new ArrayList<>();
//        int death =5;
//        int people =20;
//        int temp=5;
//
//        for (int a =1; a <= people; a++) {
//            Person.add(a);
//        }
//
//        System.out.println(Person);
//    while (Person.size() != 1) {
//        System.out.println("Person.get(" + (death - 1) + ") =  " + Person.get(death - 1) + "");
//        Person.remove(death - 1);
//        System.out.println();
//        death = death + (temp -1);
//
//        if (death > Person.size()) {
//            System.out.println("death-Person.size() : " + (death - Person.size()));
//            death = death - Person.size();
//            if (death > Person.size()) {
//                death = death - Person.size();
//            }
//        }
//    }
//
//        System.out.println();
//        System.out.println(Person);

    }



    public static int getSurvivingIndex(int n, int k) {

        int result =0;
        ArrayList<Integer> Person = new ArrayList<>(n);
        int death =k;
        int temp =death;
        int people = n;

        for (int a =1; a <= people; a++) {
            Person.add(a);
        }


        while (Person.size() != 1) {
           // System.out.println("Person.get(" + (death - 1) + ") =  " + Person.get(death - 1) + "");
            print_output(Person.get(death - 1) );
            Person.remove(death - 1);
           // System.out.println();
            death = death + (temp -1);

            if (death > Person.size()) {
                //System.out.println("death-Person.size() : " + (death - Person.size()));
                death = death - Person.size();
                if (death > Person.size()) {
                    death = death - Person.size();

                }
            }
        }
        result = Person.get(0);
        return result;

    }




}
