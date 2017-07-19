/**
 * Created by Administrator on 2017-07-19.
 */

//은행 거래를 위한 사람 클래스
public class Person{

    private String name;    //사람의 이름을 저장하기위한 변수
    private  int age;        //사람의 나이를 저장하기위한 변수
    private  int cashAmount; //사람이 가지고있는 현금을 저장하기 위한 변수
    private  BankAccount account; //사람의 통장 잔액을 저장하기 위한 변수

    //2개의 생성자
    public Person(String pNname, int pAge) {
        name = pNname;
        age =pAge;
        cashAmount = 0;
    }

    public Person(String pNname, int pAge, int pCashAmount) {
        name = pNname;
        age =pAge;
        cashAmount=pCashAmount;
    }




    public void setName(String newname) {
        name = newname;
    }
    public String getName(){
        return name;
    }


    public void setAge(int newage) {
        age = newage;
    }
    public int getAge(){
        return age;
    }


    public void setCashAmount(int newCashAmount){
        cashAmount =newCashAmount;
    }
    public int getCashAmount() {
        return cashAmount;
    }

    public void setAccount (BankAccount newBankAccount){
        account = newBankAccount;
    }
    public  BankAccount getAccount(){
        return account;
    }

    // 첫 번째 파라미터: 받는 사람 (Person)
    // 두 번째 파라미터: 이체할 금액 (정수)
    // 리턴 : 성공여부 (불린)
    public boolean transfer(Person to, int amount) {
            if(account.getBalance() <=0 || amount <=0) {
                System.out.println("false - from: "+account.getOwner().getName()+", to: "+to.getName()+", amount: "+amount+", deposit: "+account.getBalance());
                return false;

            }
            account.setBalance(account.getBalance()-amount);
            to.getAccount().setBalance(to.getAccount().getBalance()+amount);
            System.out.println("true - from: "+account.getOwner().getName()+", to: "+to.getName()+", amount: "+amount+", deposit: "+account.getBalance());
        return true;
    }

    // 첫 번째 파라미터: 받는 사람의 계정 (BankAccount)
    // 두 번째 파라미터: 이체할 금액 (정수)
    // 리턴 : 성공여부 (불린)
    public boolean transfer(BankAccount to, int amount) {
       if(account.getBalance() <= 0 || amount <=0 ) {
          System.out.println("false - from: "+account.getOwner().getName()+", to: "+to.getOwner().getName()+", amount: "+amount+", deposit: "+account.getBalance());

           return false;
       }
        account.setBalance(account.getBalance()-amount);
       to.setBalance(to.getBalance() + amount);
        System.out.println("true - from: "+account.getOwner().getName()+", to: "+to.getOwner().getName()+", amount: "+amount+", deposit: "+account.getBalance());

        return true;
    }


}


