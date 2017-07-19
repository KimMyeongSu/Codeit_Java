/**
 * Created by Administrator on 2017-07-19.
 */
public class BankAccount {

    private int balance;  //통장의 잔액을 위한 변수
    private Person owner; // 사람을 지정하기 위한 변수
    //3개의 생성자
    public BankAccount(int pBalance) {
        if(pBalance <=0) {
            balance = 0;
        }
        balance = pBalance;

    }

    public BankAccount(Person pOwner) {
        owner=pOwner;
        balance=0;
    }

    public BankAccount(int pBalance, Person pOwner) {

        if(pBalance <=0) {
            balance = 0;
        }
        balance=pBalance;

        owner=pOwner;

    }



    public void setBalance(int newBalance){
        balance = newBalance;
    }

    public void setOwner(Person newowner){
        owner = newowner;
    }

    public int getBalance() {
        return balance;
    }

    public Person getOwner(){
        return owner;
    }
    // 파라미터 : 입금할 액수(정수)
    // 리턴 : 성공여부(불린)
    //입금
    boolean deposit(int amount) {

        if(getOwner().getCashAmount() < amount){ //사람의 현금이 입금금액보다 작을경우 .
            System.out.println("입금 실패입니다. 잔고 : " +getBalance()+ "원, 현금: "+getOwner().getCashAmount()+"원" );
            return false;
        }

        else {
            setBalance(getBalance()+ amount);//입금된 금액만큼 통장잔고로 추가
            //owner.cashAmount  = owner.cashAmount - amount; //입금한 금액만큼 현금에서 차감
            getOwner().setCashAmount(getOwner().getCashAmount() -amount);
            System.out.println( +amount + "원 입금하였습니다. 잔고 : " +getBalance()+ "원, 현금: "+getOwner().getCashAmount()+"원" );
            return true;
        }

    }
    // 파라미터 : 출금할 액수(정수)
    // 리턴 : 성공여부(불린)

    //출금
    boolean withdraw(int amount) {
        if (getOwner().getAccount().getBalance() < amount) //사람의 통장에서의 잔고가 출금액보다 작을경우
        {
            System.out.println("출금 실패입니다. 잔고 : " +getBalance()+ "원, 현금: "+getOwner().getCashAmount()+"원");
            return false;
        }

        else {
            getOwner().setCashAmount(getOwner().getCashAmount()+amount);
            setBalance(getBalance()-amount);
            System.out.println( +amount + "원 출금하였습니다. 잔고 : " +getBalance()+ "원, 현금: "+getOwner().getCashAmount()+"원" );
            return true;
        }

    }


    /*  (1) 송금 성공 시 true를 리턴, 실패시 false를 리턴합니다.

        (2) 송금하고자 하는 금액(amount)이 음수일 때 송금 실패입니다.

        (3) amount가 잔고(balance)보다 클 때 송금 실패입니다.

        (4) 나의balance를 amount 만큼 줄이고, 받는사람(to)의 balance를 amount만큼 늘려줍니다.

        (5) 송금 성공시 아래 문구를 출력합니다:
    * */
        // 첫 번째 파라미터: 받는 사람 (Person)
        // 두 번째 파라미터: 이체할 금액 (정수)
        // 리턴 : 성공여부 (불린)

        public boolean transfer(Person to, int amount) {
            if(owner.getAccount().getBalance() < amount || amount <= 0) {
                System.out.println("false - from: "+owner.getName()+", to: "+to.getName()+", amount: "+amount+", deposit: "+owner.getAccount().getBalance());
                return false;
            }
            owner.getAccount().setBalance(owner.getAccount().getBalance()-amount); //보내는 사람의 통장잔고에서 이체금액 제외
            to.getAccount().setBalance(to.getAccount().getBalance()+amount);
            System.out.println("true - from: "+owner.getName()+", to: "+to.getName()+", amount: "+amount+", deposit: "+owner.getAccount().getBalance());
            return true;
        }

        // 첫 번째 파라미터: 받는 사람의 계정 (BankAccount)
        // 두 번째 파라미터: 이체할 금액 (정수)
        // 리턴 : 성공여부 (불린)
        public boolean transfer(BankAccount to, int amount) {
           if(owner.getAccount().getBalance() < amount || amount <= 0) {
               System.out.println("false - from: "+owner.getName()+", to: "+to.owner.getName()+", amount: "+amount+", deposit: "+owner.getAccount().getBalance());
               return false;
            }
           owner.getAccount().setBalance(owner.getAccount().getBalance() - amount);
           to.setBalance(to.getBalance()+amount);
            System.out.println("true - from: "+owner.getName()+", to: "+to.owner.getName()+", amount: "+amount+", deposit: "+owner.getAccount().getBalance());
           return true;
        }
        }


