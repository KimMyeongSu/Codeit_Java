import java.util.Scanner;

/**
 * Created by Administrator on 2017-07-19.
 */
public class BankDriver {
    public static void main(String[] args) {


        //---------------------------------생성자 학습 전의 디폴트 생성자 객체생성 연습 --------------------------------
/*
        Person p1 = new Person();   //사람 객체p1을 생성
        BankAccount a1 = new BankAccount(); //은행계좌 객체 a1을 생성

        Person p2 = new Person();
        BankAccount a2 = new BankAccount();
*/
        // ---------------------------------------------------------------------------------------------------------

     //---------------------------------생성자를 이용한 객체생성 연습 --------------------------------------------------

        Person p1 = new Person("김신의",28);
        p1.setCashAmount(30000);
        Person p2 = new Person("문종모",25,100000);

        BankAccount a1 = new BankAccount(p1);
        //BankAccount a1 = new BankAccount(200000,p1);
        a1.setBalance(100000);
        BankAccount a2 = new BankAccount(500000,p2);

        p1.setAccount(a1);
        p2.setAccount(a2);
     //-----------------------------------------------------------------------------------------------------------------
        /*
        // ------------------------- setter /getter 학습 이전의 객체 초기화 연습 -------------------------------------

        p1.name = "김신의";         //생성된 객체 p1의 이름을 김신의로 초기화
        p1.age = 28;                //생성된 객체 p1의 나이를 28로 초기화
        p1.cashAmount = 3000;      //생성된 객체 p1의 가지고 있는 현금을 30000원으로 초기화
        a1.balance = 100000;                //생성된 객체 a1의 잔고를 100000원으로 초기화
        p2.name = "김명수";
        p2.age = 25;
        p2.cashAmount = 100000;
        a2.balance = 500000;

        p1.account = a1;                    //p1 객체의 통장을 생성된 통장객체 a1으로 설정
        a1.owner = p1;                      //a1객체의 사람을 생성된 사람객체 p1으로 설정
        p2.account =a2;
        a2.owner = p2


        // ---------------------------------------------------------------------------------------------------------
        */


        // ------------------------- setter /getter 를 이용한 초기화 연습      -------------------------------------
/*
        p1.setName("김신의");
        p1.setAge(28);
        p1.setCashAmount(30000);
        a1.setBalance(100000);
        p1.setAccount(a1);
        a1.setOwner(p1);


        p2.setName("김명수");
        p2.setAge(25);
        p2.setCashAmount(100000);
        a2.setBalance(500000);
        p2.setAccount(a2);
        a2.setOwner(p2);

*/

        // ---------------------------------------------------------------------------------------------------------




        // ------------------------- 객체의 메소드 호출 연습 -------------------------------------

         /*
        System.out.println(a1.deposit(30000));
        System.out.println(a1.withdraw(17000));
        System.out.println(a1.deposit(620000));
        System.out.println(a1.withdraw(890000));

        System.out.println(a2.deposit(30000));
        System.out.println(a2.withdraw(170000));
        System.out.println(a2.deposit(620000));
        System.out.println(a2.withdraw(890000));

        */

        // ---------------------------------------------------------------------------------------------------------

        a2.transfer(a1, 200000);
        a1.transfer(p2, 150000);
        p2.transfer(a1, 270000);
        p1.transfer(p2, 130000);

    }
}
